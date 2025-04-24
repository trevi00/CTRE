package r._r_ex_재귀와확통._02_중복조합;

public class _02_중복조합 {
    static int n;
    static int r;
    static int[] duplicateNums;

    static void duplicatePerm(int depth, int start){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                sb.append(duplicateNums[i]).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for(int i = start; i <= n; i++){
            duplicateNums[depth] = i;
            duplicatePerm(depth + 1, i);
        }
    }

    public static void main(String[] args) {
        n = 3;
        r = 2;
        duplicateNums = new int[r];

        duplicatePerm(0, 1);
    }
}
