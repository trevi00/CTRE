package r._r_ex_재귀와확통;

public class _02_ {
    static int n;
    static int r;
    static int[] nums;
    static int k;

    static void duplicatePerm(int depth, int sum){
        if(sum> k) return;

        if(depth == r){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < r; i++){
                sb.append(nums[i]).append(" ");
            }

            System.out.println(sb.toString().trim());
            return;
        }

        for(int i = 1; i <= n; i++){
            nums[depth] = i;
            duplicatePerm(depth + 1, sum+i);
        }
    }

    public static void main(String[] args) {
        n = 5;
        r = 3;
        k = 7;

        nums = new int[r];

        duplicatePerm(0, 0);
    }


}
