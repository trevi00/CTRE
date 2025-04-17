package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int max = Integer.MIN_VALUE;

        int adr = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());

            if(max < arr[i]){
                max = arr[i];
                adr = i;
            }
        }

        System.out.println(arr[adr] + "\n" + (adr+1));
    }
}
