package _z_백준._05_문자와_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();

        if(str.isEmpty()) {
            System.out.println(0);
        } else {
        String[] input = str.split(" ");
            System.out.println(input.length);
        }
    }
}
