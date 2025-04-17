package _ex1_Stream;

import java.util.HashMap;
import java.util.Map;

public class _03_map_필터링_정렬 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);

        map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));


    }
}
