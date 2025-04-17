package _03_문자열_메서드;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _02_ {
    public static void main(String[] args) {
        String str = "Hello World!";
        str = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch)) continue; // ✅ 문자만 카운트
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
