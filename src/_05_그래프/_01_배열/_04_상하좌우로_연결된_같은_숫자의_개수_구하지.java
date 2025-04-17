package _05_그래프._01_배열;

import java.util.Scanner;

/*
4 5
1 2 2 3 4
1 1 2 2 4
1 1 9 9 4
0 1 1 1 4
1 1
*/

public class _04_상하좌우로_연결된_같은_숫자의_개수_구하지 {
    static int[][] map;
    static boolean[][] visited;
    static int n, m, target, count;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        target = map[x][y];
        System.out.println("Start from: (" + x + "," + y + "), value: " + target);

        count=0;

        dfs(x, y);

        System.out.println(count);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        System.out.println("Visiting: (" + x + "," + y + ")");

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && map[nx][ny] == target) {
                    dfs(nx, ny); // 재귀적으로 주변 탐색
                }
            }
        }
    }
}
