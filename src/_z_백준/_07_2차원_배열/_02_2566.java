package _z_백준._07_2차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        for(int i = 0; i < 9; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        int max = Integer.MIN_VALUE;
        int idx1 = 0;
        int idx2 = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j <9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((idx1+1) + " " + (idx2+1));
    }
}
