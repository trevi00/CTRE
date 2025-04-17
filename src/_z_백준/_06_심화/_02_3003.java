package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int[] arr = {1, 1, 2, 2, 2, 8};
        int cnt[] = new int[arr.length];

        for(int i =0; i < arr.length; i++){
            int tmp = arr[i]-Integer.parseInt(input[i]);
            cnt[i] = tmp;
        }

        for(int c : cnt){
            System.out.print(c + " ");
        }
    }
}
