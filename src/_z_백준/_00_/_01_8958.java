package _z_백준._00_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            char[] chs = br.readLine().toCharArray();
            int score = 0;
            int window = 0;
            for(char ch : chs){
                if(ch == 'O') {
                    window++;
                } else {
                    window = 0;
                }
                score += window;
            }

            System.out.println(score);
        }
    }
}
