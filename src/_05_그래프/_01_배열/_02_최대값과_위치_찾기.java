package _05_그래프._01_배열;

import java.util.Scanner;

public class _02_최대값과_위치_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
3 4
1 5 3 2
4 8 6 7
9 2 0 1
*/

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int max = Integer.MIN_VALUE;
        int maxl = 0;
        int maxr = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxl = i;
                    maxr = j;
                }
            }
        }

        System.out.println(max + " " + maxl + " " + maxr);
    }
}
