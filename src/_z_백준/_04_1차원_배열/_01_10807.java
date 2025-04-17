package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _01_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < input.length; i++){
            int num = Integer.parseInt(input[i]);
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int v = Integer.parseInt(br.readLine());

        System.out.println(map.getOrDefault(v, 0));

    }
}
