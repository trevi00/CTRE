package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _05_중첩Map_2 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<>();

        map.put("Alice", new HashMap<>());
        map.get("Alice").put("Math", 90);
        map.get("Alice").put("English", 85);

        map.put("Bob", new HashMap<>());
        map.get("Bob").put("Math", 78);
        map.get("Bob").put("English", 92);

        for(String name : map.keySet()){
            System.out.println("학생 " + name);
            Map<String, Integer> scores = map.get(name);

            for(Map.Entry<String, Integer> entry : scores.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
