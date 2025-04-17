package _z_백준._03_반복문;

import java.util.Scanner;

public class _04_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += a*b;
        }

        System.out.println(sum==X?"Yes":"No");
    }
}
