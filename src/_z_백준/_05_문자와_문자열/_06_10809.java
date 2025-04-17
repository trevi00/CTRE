package _z_백준._05_문자와_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());

        StringBuilder sb2 = new StringBuilder();


        for(int j = 'a'; j <= 'z'; j++) {
            int idx = -1;
            for (int i = 0; i < sb.length(); i++) {
                if((char) j == sb.toString().charAt(i)){
                    idx = i;
                    break;
                }
            }
            sb2.append(idx + " ");
        }
        System.out.println(sb2);
    }
}
