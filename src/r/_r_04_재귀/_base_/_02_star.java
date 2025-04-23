package r._r_04_재귀._base_;

public class _02_star {
    static int n;

    public static void main(String[] args) {
        n = 5;
        recurStars(1);
    }

    static void recurStars(int line){
        // 1, 2, 3 번 라인 피라미드 출력
        if(line == n+1) return;

        for(int i = 0; i < n - line; i++){
            System.out.print(' ');
        }

        for(int i = 0; i < 2*line-1; i++){
            System.out.print('*');
        }

        System.out.println();

        recurStars(line+1);

        //역 피라미드는 역방향 출력
        if(line == n) return;

        for(int i = 0; i < n-line; i++){
            System.out.print(' ');
        }

        for(int i = 0; i < 2*line-1; i++){
            System.out.print('*');
        }
        System.out.println();
    }
}
