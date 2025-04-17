package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            String[] input2 = br.readLine().split(" ");
            int n1 = Integer.parseInt(input2[0])-1;
            int n2 = Integer.parseInt(input2[1])-1;

            while(n1<n2){
                int tmp = arr[n1];
                arr[n1] = arr[n2];
                arr[n2] = tmp;
                n1++;
                n2--;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
