package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());

        StringBuilder sb2 = new StringBuilder(sb.toString());

        System.out.println((sb.compareTo(sb2.reverse()) == 0) ?1:0);
    }
}
