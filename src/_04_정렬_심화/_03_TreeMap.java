package _04_정렬_심화;

import java.util.Map;
import java.util.TreeMap;

public class _03_TreeMap {
    public static void main(String[] args) {
        //Key
        //기준
        //자동 정렬되는 Map, 즉 Map + 정렬 기능 결합
        Map<String, Integer> map = new TreeMap<>();

        map.put("banana", 4);
        map.put("apple", 1);
        map.put("cherry", 2);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
