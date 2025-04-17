package _05_그래프._01_배열;

import java.util.Scanner;

/*
4 5
1 1 0 0 0
1 1 0 1 1
0 0 0 1 1
0 1 0 0 0
*/

public class _05_섬의_개수 {
    static Scanner sc = new Scanner(System.in);
    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static int cnt;
    //상하좌우
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 아직 방문 안 했고, 땅(1)이면 탐색 시작
                if (!visited[i][j] && arr[i][j] == 1) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && nx < n && ny >= 0 && ny < m){
                if(!visited[nx][ny] && arr[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }

}
