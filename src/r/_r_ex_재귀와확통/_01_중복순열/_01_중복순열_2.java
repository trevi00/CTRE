package r._r_ex_재귀와확통._01_중복순열;

public class _01_중복순열_2 {
    static int n;
    static int r;
    static int[] result;

    static void duplicatePerm(int depth){
        if(depth == r){
            for(int i = 0; i < r; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++){
            result[depth] = i;
            duplicatePerm(depth+1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        r = 2;
        result = new int[r];
        duplicatePerm(0);
    }
}
