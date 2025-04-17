package _04_정렬_심화;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _05_단어정렬_빈도수 {
    public static void main(String[] args) {
        String str = "apple banana apple cherry banana apple";
        String[] strs = str.split(" ");

        Map<String, Integer> tm = new TreeMap<>();

        for(String st : strs){
            tm.put(st, tm.getOrDefault(st, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : tm.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("------------");

        Map<String, Integer> tm2 = new TreeMap<>(Comparator.reverseOrder());

        for(String st : strs){
            tm2.put(st, tm2.getOrDefault(st, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : tm2.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
