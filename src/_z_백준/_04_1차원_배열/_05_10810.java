package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];

        for(int i = 0; i < M; i++) {
            String[] input2 = br.readLine().split(" ");
            int n1 = Integer.parseInt(input2[0]);
            int n2 = Integer.parseInt(input2[1]);
            int n3 = Integer.parseInt(input2[2]);

            for (int j = n1-1; j < n2; j++) {
                arr[j] = n3;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
