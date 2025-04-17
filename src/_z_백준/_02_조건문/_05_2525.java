package _z_백준._02_조건문;

import java.util.Scanner;

public class _05_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = sc.nextInt();

        int a = (C+B)/60;
        int b = (C+B)%60;

        A = (A+a) % 24;
        B = b;

        System.out.println(A + " " + B);
    }
}
