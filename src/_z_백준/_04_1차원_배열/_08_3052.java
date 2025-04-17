package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _08_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int[] arr = new int[10];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());

            map.put(num%42, map.getOrDefault(num%42, 0)+1);
        }

        System.out.println(map.size());

    }
}
