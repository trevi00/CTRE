package _01_배열;

public class _02_배열_누적합 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int[] preSum = preSum(arr);
        for(int x : preSum){
            System.out.println(x);
        }

    }

    static int[] preSum(int[] arr){
        int[] preSum = new int[arr.length+1];
        preSum[0] = 0;
        for(int i = 1; i < preSum.length; i++){
            preSum[i] = preSum[i-1] + arr[i-1];
        }

        return preSum;
    }
}
