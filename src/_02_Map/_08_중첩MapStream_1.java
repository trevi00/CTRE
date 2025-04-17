package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _08_중첩MapStream_1 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> scores = new HashMap<>();

        scores.put("Alice", Map.of("Math", 90, "English", 85));
        scores.put("Bob", Map.of("Math", 78, "English", 92));
        scores.put("Charlie", Map.of("Math", 95, "English", 70));

        /*
Map<String, Map<String, Integer>> 형식의 학생 점수 정보가 주어진다.
각 학생별로 가장 점수가 높은 과목명과 점수를 출력하라.*/

        // 학생 중심
        Map<String, String> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for (String student : scores.keySet()){
            int max = Integer.MIN_VALUE;
            String maxSubject = "";

            for(Map.Entry<String, Integer> entry : scores.get(student).entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxSubject = entry.getKey();
                }
            }

            m1.put(student, maxSubject);
            m2.put(student, max);
        }

        for(String student : m1.keySet()){
            System.out.println(student + "최고 과몬 : " + m1.get(student) + " (" + m2.get(student) + ")");
        }

    }
}
