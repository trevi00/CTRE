package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _08_중첩MapStream_1_re {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> scores = new HashMap<>();

        scores.put("Alice", Map.of("Math", 90, "English", 85));
        scores.put("Bob", Map.of("Math", 78, "English", 92));
        scores.put("Charlie", Map.of("Math", 95, "English", 70));

        /*
Map<String, Map<String, Integer>> 형식의 학생 점수 정보가 주어진다.
각 학생별로 가장 점수가 높은 과목명과 점수를 출력하라.*/

        // 학생 중심
        for (String student : scores.keySet()) {
            Map<String, Integer> subjectMap = scores.get(student);

            Map.Entry<String, Integer> topSubject = subjectMap.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .orElse(null);

            if (topSubject != null) {
                System.out.println(student + " → 최고 과목: " + topSubject.getKey() + " (" + topSubject.getValue() + ")");
            }
        }

    }
}
