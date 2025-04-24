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
            if(sum == k) return 1;
            else return 0;
        }

        int total = 0;
        for(int i = 1; i <= n; i++){
            total += duplicatePerm(depth+1, sum+i);
        }

        return total;
    }

    public static void main(String[] args) {
        n = 5;
        r = 3;
        k = 7;

        nums = new int[r];

        System.out.println(duplicatePerm(0,0));
    }
}
