package _z_백준._02_조건문;

import java.util.Scanner;

public class _03_2753 {
    public static void main(String[] args) {
        // % 4 == 0 && % 100 == 0
        // % 400 == 0

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
