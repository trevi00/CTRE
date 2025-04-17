package _z_백준._03_반복문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _09_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if(a == 0 && b == 0) break;

            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
