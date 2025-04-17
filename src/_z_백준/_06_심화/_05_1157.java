package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _05_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder(br.readLine().toUpperCase());

        for(char ch : sb.toString().toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int max = -1;
        char chIdx = '?';

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
                chIdx = entry.getKey();
            } else if (count == max) {
                chIdx = '?';
            }
        }

        System.out.println(chIdx);
    }
}
