package _z_백준._04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _02_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        String[] arr = br.readLine().split(" ");

        Queue<Integer> q = new LinkedList<>();
        for(String idx : arr){
            q.offer(Integer.parseInt(idx));
        }

        int size = q.size();
        for(int i = 0; i < size; i++){
            int num = q.poll();
            if(num < X){
                System.out.print(num + " ");
            }
        }
    }
}
