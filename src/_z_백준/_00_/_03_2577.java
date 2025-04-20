package _z_백준._00_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[10];

        int num = 1;
        for(int i = 0; i < 3; i++){
            num *= Integer.parseInt(br.readLine());
        }

        while(num > 0){
            nums[num%10]++;
            num/=10;
        }

        for(int x : nums){
            System.out.println(x);
        }
    }
}
