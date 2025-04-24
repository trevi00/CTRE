package r._r_ex_재귀와확통._02_중복조합;

public class _02_중복조합_4 {
    static int n;
    static int r;
    static int[] nums;
    static int x;

    static void duplicateCombination(int depth, int start, int sum, int k, boolean isX){
        if(depth == r){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < r; i++){
                sb.append(nums[i]).append(" ");
            }

            if(sum == k && isX) System.out.println(sb);
            return;
        }

        for(int i = start; i <= n; i++){
            nums[depth] = i;
            duplicateCombination(depth+1, i, sum+i, k, isX||(i == x));
        }
    }

    public static void main(String[] args) {
        n = 4;
        r = 3;
        int k = 4;
        x = 2;  // 반드시 포함되어야 할 수

        nums = new int[r];

        duplicateCombination(0, 0, 0, k, false);
    }
}
