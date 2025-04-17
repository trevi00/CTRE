package _02_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _01_MapSort {
    public static void main(String[] args) {
        String sentence = "apple banana apple orange banana apple";

        String[] strs = sentence.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String str : strs){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // 오름차순
        entryList.sort((a, b) -> a.getValue() - b.getValue());
        // 내림차순
        entryList.sort((a, b) -> b.getValue() - a.getValue());

    }
}
