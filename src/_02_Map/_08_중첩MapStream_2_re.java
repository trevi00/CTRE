package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _08_중첩MapStream_2_re {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> scores = new HashMap<>();

        scores.put("Alice", Map.of("Math", 90, "English", 85));
        scores.put("Bob", Map.of("Math", 78, "English", 92));
        scores.put("Charlie", Map.of("Math", 95, "English", 70));

/*
문제 2: 과목별 총점과 평균 점수 출력
(Stream 활용)
📌 설명
중첩 Map에서 과목별로 전체 점수를 합산하고,
평균을 계산하라.
예: Math → 총합: 263, 평균: 87

✅ 연습 포인트
values() 스트림 처리
sum, count 계산
*/
        scores.values().stream()
                .flatMap(subjectMap ->
                        subjectMap.entrySet().stream())
                .collect(
                        java.util.stream.Collectors.groupingBy(
                                Map.Entry::getKey,
                                java.util.stream.Collectors.averagingInt(Map.Entry::getValue)
                        )
                )
                .forEach((subject, avg) -> System.out.println(subject + " 평균 : " + (int)Math.round(avg)));

    }
}
