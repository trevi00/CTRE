package _z_백준._03_반복문;

import java.util.Scanner;

public class _05_25314 {
    public static void main(String[] args) {
        // long > +4

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println("long ".repeat(N/4) + "int");
    }
}
