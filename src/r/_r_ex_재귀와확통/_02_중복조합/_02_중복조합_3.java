package r._r_ex_재귀와확통._02_중복조합;

public class _02_중복조합_3 {
    static int n;
    static int r;
    static int[] nums;

    static void duplicateCom(int depth, int start, int sum, int k){
        if(depth == r){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                sb.append(nums[i]).append(" ");
            }
            if(sum == k) System.out.println(sb);
            return;
        }

        for(int i = start; i <= n; i++){
            nums[depth] = i;
            duplicateCom(depth+1, i, sum+i, k);
        }
    }

    public static void main(String[] args) {
        n = 4;
        r = 3;
        nums = new int[r];
        duplicateCom(0, 0, 0, 4);
    }
}
