package _05_그래프._01_배열;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _06_감염이_퍼지는_시간 {

    static int[][] grid;
    static int[][] time;
    static boolean[][] visited;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];
        time = new int[n][m];
        visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        // 입력 및 초기 감염자 큐에 추가
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 1) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        // BFS는 입력을 받을때 이렇게 하는구나?

        // BFS
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && grid[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        grid[nx][ny] = 1;
                        time[nx][ny] = time[x][y] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

        // 정답 계산
        int maxTime = 0;
        boolean allInfected = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    allInfected = false;
                }
                maxTime = Math.max(maxTime, time[i][j]);
            }
        }

        System.out.println(allInfected ? maxTime : -1);
    }
}

