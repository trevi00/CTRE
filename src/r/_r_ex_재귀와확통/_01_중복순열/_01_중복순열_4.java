package r._r_ex_재귀와확통._01_중복순열;

public class _01_중복순열_4 {
    static int n;
    static int r;
    static int[] duplicateNums;

    static int k;

    static void duplicatePerm(int depth, int k){
        if(depth == r) {
            StringBuilder sb = new StringBuilder();
            boolean isK = false;
            for (int i = 0; i < r; i++) {
                if(duplicateNums[i] == k) isK = true;
                sb.append(duplicateNums[i] + " ");
            }
            if(isK) System.out.println(sb);
            return;
        }

        for(int i = 1; i <= n; i++){
            duplicateNums[depth] = i;
            duplicatePerm(depth+1, k);
        }
    }

    public static void main(String[] args) {
        n = 3;
        r = 2;
        duplicateNums = new int[r];
        k = 2;

        duplicatePerm(0, k);
    }
}
