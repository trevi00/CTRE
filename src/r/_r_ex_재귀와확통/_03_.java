package r._r_ex_재귀와확통;

public class _03_ {
    static int n;
    static int r;
    static int[] nums;

    static int k;

    static int duplicatePerm(int depth, int sum){
        if(sum > k){
            return 0;
        }

        if(depth == r){
            return (sum == k ? 1 : 0);
        }

        int total = 0;
        for(int i = 1; i <= n; i++){
            total += duplicatePerm(depth+1, sum+i);
        }

        return total;
    }

    public static void main(String[] args) {
        n = 2;
        r = 2;
        k = 3;

        nums = new int[r];

        System.out.println(duplicatePerm(0,0));
    }
}
