package r._r_ex_재귀와확통._03_조합;

public class _02_ {
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

            if(sum == k && xCnt>0) System.out.println(sb.toString().trim());
            return;
        }

        for(int i = start; i <= n; i++){
            if(i % 2 != 0) continue;
            nums[depth] = i;
            combination(depth + 1, i+1, sum+i, k, (i==x?xCnt+1:xCnt));
        }
    }

    public static void main(String[] args) {
        n = 6;
        r = 2;
        int k = 8;
        x = 2;

        nums = new int[r];

        combination(0, 0, 0, k, 0);
    }
}
