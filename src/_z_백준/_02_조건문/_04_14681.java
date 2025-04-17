package _z_백준._02_조건문;

import java.util.Scanner;

public class _04_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if(x<0 && y <0){
            ans = 3;
        } else if (x < 0 && y > 0) {
            ans = 2;
        } else if (x > 0 && y < 0) {
            ans = 4;
        } else if (x > 0 && y > 0) {
            ans = 1;
        }

        System.out.println(ans);
    }
}
