package _z_백준._05_문자와_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String str = input[1];

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                sb.append(String.valueOf(ch).repeat(R));
            }
//            String.valueOf() char int long > String
            System.out.println(sb);
        }

    }
}
