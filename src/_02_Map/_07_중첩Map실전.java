package _02_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _07_중첩Map실전 {
    public static void main(String[] args) {
        String[][] rawScores = {
                {"Alice", "Math", "90"},
                {"Alice", "English", "85"},
                {"Bob", "Math", "78"},
                {"Bob", "English", "92"},
                {"Charlie", "Math", "95"},
                {"Charlie", "English", "70"}
        };

        Map<String, Map<String, Integer>> map = new HashMap<>();

        for(String[] strs :rawScores){
            map.putIfAbsent(strs[0], new HashMap<>());
            map.get(strs[0]).put(strs[1], Integer.parseInt(strs[2]));
        }

        Map<String, String> topScorers = new HashMap<>();
        Map<String, Integer> topScores = new HashMap<>();

        for(String student : map.keySet()){
            for(Map.Entry<String, Integer> entry : map.get(student).entrySet()) {
                String subject = entry.getKey();
                int score = entry.getValue();

                if(!topScores.containsKey(subject) || score > topScores.get(subject)){
                    topScores.put(subject, score);
                    topScorers.put(subject, student);
                }
            }
        }

        System.out.println("과목별 최고 득점자");
        for(String subject : topScores.keySet()){
            System.out.println(subject + " : " + topScorers.get(subject) + " (" + topScores.get(subject) + ")");
        }


        System.out.println();

        // 총점 기준 정렬
        List<Map.Entry<String, Map<String, Integer>>> entryList = new ArrayList<>(map.entrySet());

        System.out.println("📌 총점 기준 정렬:");
        for (Map.Entry<String, Map<String, Integer>> entry : entryList) {
            int total = 0;
            for (int score : entry.getValue().values()) {
                total += score;
            }
            System.out.println(entry.getKey() + " → 총점: " + total);
        }

        System.out.println();

        // 과목별 평균 점수
        Map<String, Integer> subjectTotal = new HashMap<>();
        Map<String, Integer> subjectCount = new HashMap<>();

        for (Map<String, Integer> scores : map.values()) {
            for (Map.Entry<String, Integer> e : scores.entrySet()) {
                String subject = e.getKey();
                int score = e.getValue();

                subjectTotal.put(subject, subjectTotal.getOrDefault(subject, 0) + score);
                subjectCount.put(subject, subjectCount.getOrDefault(subject, 0) + 1);
            }
        }

        System.out.println("📌 과목별 평균 점수:");
        for (String subject : subjectTotal.keySet()) {
            int avg = subjectTotal.get(subject) / subjectCount.get(subject);
            System.out.println(subject + " → 평균: " + avg);
        }
    }
}
