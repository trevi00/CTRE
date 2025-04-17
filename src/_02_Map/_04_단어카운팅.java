package _02_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _04_단어카운팅 {
    public static void main(String[] args) {
        String str1 = "apple banana apple orange banana apple";

        String[] strs = str1.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String str : strs){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a, b) -> {
            if(b.getValue().equals(a.getValue())){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(entryList.get(0).getKey());
    }
}
