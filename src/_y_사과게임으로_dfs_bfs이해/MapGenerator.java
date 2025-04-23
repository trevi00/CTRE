package _y_사과게임으로_dfs_bfs이해;

import java.util.Random;

public class MapGenerator {

    // 무작위 2차원 배열 생성
    public static int[][] createRandomArray(int rows, int cols, int min, int max) {
        int[][] result = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = rand.nextInt(max - min) + min;
            }
        }

        return result;
    }

    // 2차원 배열 출력
    public static void showMap(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}

