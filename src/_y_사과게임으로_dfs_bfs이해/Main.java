package _y_사과게임으로_dfs_bfs이해;

public class Main {
    // 예시 실행용 main 메서드
    public static void main(String[] args) {

        int[][] map = MapGenerator.createRandomArray(5, 5, 1, 10); // 5x5 배열, 1~10 사이의 무작위 수
        MapGenerator.showMap(map);

    }
}
