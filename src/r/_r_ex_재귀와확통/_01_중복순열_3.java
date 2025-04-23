package r._r_ex_재귀와확통;

public class _01_중복순열_3 {
    static int n;
    static int r;
    static int[] duplicateNums;

    static void duplicatePerm(int depth, int k){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(int i = 0; i < r; i++){
                sum += duplicateNums[i];
                sb.append(duplicateNums[i]).append(" ");
            }
            if(sum == k){
                System.out.println(sb);
            }
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
        int k = 4;
        duplicatePerm(0, k);
    }
}
