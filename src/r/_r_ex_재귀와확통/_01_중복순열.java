package r._r_ex_재귀와확통;

import java.util.Scanner;

public class _01_중복순열 {
    /*
    * 001
    * 002
    * 003
    * ...
    * 442
    * 443
    * 444*/
    static int n; // 사용할 숫자 범위 : 1~n;
    static int r; // 뽑을 개수
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개 중에서 r개를 중복해서 뽑을거임");
        System.out.println("n ; ");
        n = sc.nextInt();
        System.out.println("r : ");
        r = sc.nextInt();
        result = new int[r];

        duplicatePerm(0);
    }

    static void duplicatePerm(int depth) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            result[depth] = i;
            duplicatePerm(depth + 1);
        }
    }
}
