package r._r_ex_재귀와확통;

public class _01_ {
    static int n;
    static int r;
    static int[] nums;

    static int k;
    static int x;

    static void duplicatePerm(int depth, int sum, int xCnt){
        if(depth == r){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < r; i++){
                sb.append(nums[i]).append(" ");
            }

            if(sum == k && xCnt>0) System.out.println(sb.toString().trim());
            return;
        }

        for(int i = 0; i <= n; i++){
            nums[depth] = i;
            duplicatePerm(depth+1, sum+i, x==i?xCnt+1:xCnt);
        }
    }

    public static void main(String[] args) {
        n = 5;
        r = 3;
        k = 9;
        x = 3;

        nums = new int[r];

        duplicatePerm(0, 0, 0);
    }
}
