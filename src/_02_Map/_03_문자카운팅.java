package _02_Map;

import java.util.HashMap;
import java.util.Map;

public class _03_문자카운팅 {
    public static void main(String[] args) {
        String str1 = "banana";

        Map<Character, Integer> map = new HashMap<>();

        for(Character ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
