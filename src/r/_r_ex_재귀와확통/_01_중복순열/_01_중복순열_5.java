package r._r_ex_재귀와확통._01_중복순열;

public class _01_중복순열_5 {
    static int n;
    static int r;
    static int[] duplicateNums;

    static void duplicatePerm(int depth){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            boolean isEven = true;
            for(int i = 0; i < r; i++){
                sb.append(duplicateNums[i]).append(" ");
                if(duplicateNums[i] % 2 != 0) isEven = false; break;
            }
            if(isEven) System.out.println(sb);
            return;
        }

        for(int i = 1; i <= n; i++){
            duplicateNums[depth] = i;
            duplicatePerm(depth + 1);
        }
    }

    public static void main(String[] args) {
        n = 4; r = 2; duplicateNums = new int[r];
        duplicatePerm(0);
    }
}
