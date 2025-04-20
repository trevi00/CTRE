package _z_백준._00_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int[] nums = new int[input.length];

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < input.length; i++){
            nums[i] = Integer.parseInt(input[i]);
        }

        for(int i = 1; i < input.length; i++){
            if(nums[i] > nums[i-1]) descending = false;
            else if (nums[i] < nums[i-1]) ascending = false;
        }

        if(ascending) System.out.println("ascending");
        else if(descending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
