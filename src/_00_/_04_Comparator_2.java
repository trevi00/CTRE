package _00_;

import java.util.ArrayList;
import java.util.List;

public class _04_Comparator_2 {
    public static void main(String[] args) {
        // ✅ 1. 원본 데이터
        String[][] rawData = {
                {"Alice", "82"},
                {"Bob", "95"},
                {"Charlie", "78"},
                {"Dave", "95"},
                {"Eve", "88"}
        };

        // ✅ 2. List<Person> 생성
        List<Person> people = new ArrayList<>();
        for (String[] data : rawData) {
            String name = data[0];
            int score = Integer.parseInt(data[1]);
            people.add(new Person(name, score));
        }

        // ✅ 3. 정렬: 점수 내림차순, 같으면 이름 오름차순
        people.sort((a, b) -> {
            if (a.age == b.age) return a.name.compareTo(b.name);
            return b.age - a.age;
        });

        // ✅ 4. 결과 출력
        for (Person p : people) {
            System.out.println(p.name + " " + p.age);
        }
    }
}



