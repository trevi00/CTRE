package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _02_중첩Map {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<>();

        map.put("2024", new HashMap<>());
        map.get("2024").put("Math", 95);
        map.get("2024").put("English", 88);

        System.out.println(map.get("2024").get("Math"));

    }
}
