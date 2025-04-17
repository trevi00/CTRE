package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] visited = new boolean[30];

        for(int i = 0; i < 28; i++){
            int input = Integer.parseInt(br.readLine());

            visited[input-1] = true;
        }

        for(int i = 0; i < 30; i++){
            if(visited[i]) continue;
            System.out.println((i+1));
        }
    }
}
