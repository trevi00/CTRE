package r._r_ex_재귀와확통._02_중복조합;

public class _02_중복조합_2 {
    static int n;
    static int r;
    static int[] duplicateNums;

    static void duplicatePerm(int depth, int start, int k){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(int i = 0; i < r; i++){
                sum += duplicateNums[i];
                sb.append(duplicateNums[i]).append(" ");
            }
            if(sum == k) System.out.println(sb);
            return;
        }

        for(int i = start; i <= n; i++){
            duplicateNums[depth] = i;
            duplicatePerm(depth+1, i, k);
        }
    }

    public static void main(String[] args) {
        n = 5;
        r = 3;
        int k = 7;
        duplicateNums = new int[r];

        duplicatePerm(0, 1, 7);
    }
}
