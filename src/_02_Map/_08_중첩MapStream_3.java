package _02_Map;

import java.util.*;

public class _08_중첩MapStream_3 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> scores = new HashMap<>();

        scores.put("Alice", Map.of("Math", 90, "English", 85));
        scores.put("Bob", Map.of("Math", 78, "English", 92));
        scores.put("Charlie", Map.of("Math", 95, "English", 70));

/*문제 3: 총점 상위 N명 출력
(정렬 + Stream)
📌 설명
각 학생의 모든 과목 점수를 합산해 총점을 구하라.
총점 기준으로 정렬하여 상위 N명을 출력하라.

✅ 연습 포인트
entrySet → List로 변환
Stream을 이용한 정렬 및 출력*/

        Map<String, Integer> sum = new HashMap<>();
        for(String student : scores.keySet()){
            for(Map.Entry<String, Integer> entry : scores.get(student).entrySet()){
                sum.put(student, sum.getOrDefault(student, 0)+entry.getValue());
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(sum.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int N = 2;
        System.out.println("📌 총점 상위 " + N + "명:");
        for (int i = 0; i < Math.min(N, list.size()); i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println(entry.getKey() + " 총점 : " + entry.getValue());
        }
    }
}
