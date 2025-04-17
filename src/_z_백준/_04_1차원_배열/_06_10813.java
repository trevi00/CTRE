package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0])-1;
            int b = Integer.parseInt(input2[1])-1;

            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
