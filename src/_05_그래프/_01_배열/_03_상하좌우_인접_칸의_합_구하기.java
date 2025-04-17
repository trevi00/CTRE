package _05_그래프._01_배열;

import java.util.Scanner;

public class _03_상하좌우_인접_칸의_합_구하기 {
    /*
3 3
1 2 3
4 5 6
7 8 9
1 1
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int sum = 0;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 경계값 검사
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                sum += arr[nx][ny];
            }
        }

        System.out.println(sum);
    }
}
