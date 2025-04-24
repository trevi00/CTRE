package r._r_ex_재귀와확통._03_조합;

public class _01_CombinationSumWithX {
    static int n;
    static int r;
    static int[] nums;
    static int x;

    static void combination(int depth, int start, int sum, int k, int xCnt){
        if(depth == r){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < r; i++){
                sb.append(nums[i]).append(" ");
            }

            if(sum == k && xCnt > 0) System.out.println(sb.toString().trim());
            return;
        }

        for(int i = start; i <= n; i++){
            nums[depth] = i;
            combination(depth+1, i+1, sum+i, k, (i==x?xCnt+1:xCnt));
        }
    }

    public static void main(String[] args) {
        n = 5;
        r = 3;
        int k = 9;
        x = 3;

        nums = new int[r];

        combination(0, 0, 0, k, 0);
    }
}
