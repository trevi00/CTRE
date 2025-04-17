package _z_백준._07_2차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];

        for(int i = 0; i < N; i++){
            String[] input2 = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(input2[j]);
            }
        }

        for(int i = 0; i < N; i++){
            String[] input2 = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                arr2[i][j] = Integer.parseInt(input2[j]);
            }
        }

        int[][] sum = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for(int[] a : sum){
            for (int num : a){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
