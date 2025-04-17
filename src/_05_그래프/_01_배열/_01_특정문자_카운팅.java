package _05_그래프._01_배열;

import java.util.Scanner;

public class _01_특정문자_카운팅 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 행
        int m = sc.nextInt(); // 열
        sc.nextLine(); // 개행 처리

        char[][] map = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            map[i] = line.toCharArray();
        }

        char target = sc.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == target) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}