package _z_백준._03_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_03_11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);

            sb.append("Case #").append(i).
                    append(": ").
                    append(a).append(" + ").
                    append(b).append(" = ").append(a+b).append("\n");
        }

        System.out.println(sb);
    }
}
