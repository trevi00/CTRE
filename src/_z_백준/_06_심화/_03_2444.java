package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int idx = N-1;
        for(int i = 1; i <= (2*N-1); i+=2){
            System.out.println(" ".repeat(idx--) + "*".repeat(i));
        }
        idx = 1;
        for(int i = (2*N-3); i >= 0; i-=2){
            System.out.println(" ".repeat(idx++) + "*".repeat(i));
        }
    }
}
