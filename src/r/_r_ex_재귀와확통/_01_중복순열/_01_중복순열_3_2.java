package r._r_ex_재귀와확통._01_중복순열;

public class _01_중복순열_3_2 {
    static int n;
    static int r;
    static int k;
    static int[] duplicateNums;

    static void duplicatePerm(int depth, int sum, int k){
        if(depth == r){
            if(sum == k) {
                for (int i = 0; i < r; i++) {
                    System.out.print(duplicateNums[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        for(int i = 1; i <= n; i++){
            duplicateNums[depth] = i;
            duplicatePerm(depth+1, sum+i, k);
        }
    }

    public static void main(String[] args) {
        n = 3;
        r = 2;
        duplicateNums = new int[r];
        k = 4;
        duplicatePerm(0, 0, k);
    }
}
