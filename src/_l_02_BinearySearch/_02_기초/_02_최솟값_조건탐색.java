package _l_02_BinearySearch._02_기초;

public class _02_최솟값_조건탐색 {

    public static int smallestDivisor(int[] nums, int threshold){
        int l = 1, r = getMax(nums);
        int answer = -1;

        while(l <= r) {
            int m = l + (r - l) / 2;

            if(isValid(nums, threshold, m)) {
                answer = m;
                r = m-1;
            } else {
                l = m + 1;
            }
        }
        return answer;
    }

    private static boolean isValid(int[] nums, int threshold, int divisor){
        int sum = 0;
        for (int num : nums){
            sum += Math.ceil((double) num/divisor);
        }
        return sum <= threshold;
    }

    private static int getMax(int[] nums) {
        int max = 0;
        for (int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

    }
}
