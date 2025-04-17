package _00_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_Comparator {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        Arrays.sort(arr); // 오름차순 정렬

        String[][] arr2 = {
                {"Alice", "82"},
                {"Bob", "95"},
                {"Charlie", "78"},
                {"Dave", "95"},
                {"Eve", "88"}
        };
        Person[] ps = new Person[arr2.length];
        Person[] ps2 = new Person[arr2.length];
        int idx = 0;
        for(String[] st : arr2){
            Person p = new Person(st[0], Integer.parseInt(st[1]));
            ps[idx++] = p;
            ps2[idx++] = p;
        }

        // 내림차순
        Arrays.sort(ps, (a, b) -> b.age - a.age);
        for(Person person : ps){
            System.out.println(person.name + " " +person.age);
        }

        // 같으면 사전순 오름차숨
        Arrays.sort(ps2, (a, b) -> {
            if(a.age == b.age) return a.name.compareTo(b.name);
            return a.age - b.age;
        }
    );
    }
}

