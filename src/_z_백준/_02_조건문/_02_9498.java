package _z_백준._02_조건문;

import java.util.Scanner;

public class _02_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        char outPut = 'F';

        if(score >= 90){
            outPut = 'A';
        } else if (score >= 80) {
            outPut = 'B';
        } else if (score >= 70) {
            outPut = 'C';
        } else if (score >= 60) {
            outPut = 'D';
        }

        System.out.println(outPut);
    }
}
