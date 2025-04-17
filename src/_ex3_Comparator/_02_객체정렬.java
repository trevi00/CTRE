package _ex3_Comparator;

import java.util.ArrayList;
import java.util.List;

public class _02_객체정렬 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        // 나이 오름차순
        list.sort((a,b) -> a.age - b.age);

        // 이름 사전순
        list.sort((a,b) -> a.name.compareTo(b.name));

        // 복합 조건
        list.sort((a,b) -> {
            if(a.age == b.age){
                return a.name.compareTo(b.name);
            }
            return a.age - b.age;
        });
    }
}

class Person {
    String name;
    int age;
}