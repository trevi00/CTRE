package _z_백준._03_반복문;

import java.util.Scanner;

public class _03_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
