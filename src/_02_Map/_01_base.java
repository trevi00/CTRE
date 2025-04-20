package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _01_base {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.get("apple");            // 3
        System.out.println(map.get("mango"));
        System.out.println(map.getOrDefault("mango", 0)); // 없으면 0
        System.out.println(map.containsKey("apple"));    // true
    }
}
