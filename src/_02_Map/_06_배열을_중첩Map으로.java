package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _06_배열을_중첩Map으로 {
    public static void main(String[] args) {
        String[][] rawScores = {
                {"Alice", "Math", "90"},
                {"Alice", "English", "85"},
                {"Bob", "Math", "78"},
                {"Bob", "English", "92"}
        };

        Map<String, Map<String, Integer>> map = new HashMap<>();

        for (String[] strs : rawScores) {
            /*if (!map.containsKey(strs[0])) {
                map.put(strs[0], new HashMap<>());
            }*/
            map.putIfAbsent(strs[0], new HashMap<>());
            map.get(strs[0]).put(strs[1], Integer.parseInt(strs[2]));
        }

        for(String st : map.keySet()){
            Map<String, Integer> inner = map.get(st);
            int sum = 0;
            int cnt = 0;

            for(Map.Entry<String, Integer> entry : inner.entrySet()){
                cnt++;
                sum+=entry.getValue();
            }

            System.out.println(st + " average : " + (sum/cnt));
        }
    }
}
