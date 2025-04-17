package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 점수 / M * 100

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        double[] arr = new double[N];
        double max = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Double.parseDouble(input[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double sum = 0;
        for(int i = 0; i < N; i++) {
            sum += (arr[i] / max * 100);
        }

        System.out.println(sum/N);

    }
}
