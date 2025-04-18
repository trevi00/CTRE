package _l_02_BinearySearch._01_입문;

public class _03_첫_등장_위치 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};

        System.out.println(binarySearch_first(arr, 2));
        System.out.println(binarySearch_first(arr, 3)); // 출력: 4
        System.out.println(binarySearch_first(arr, 5)); // 출력: -1
    }

    static int binarySearch_first(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        int ans = -1;

        while(l <= r){
            int m = l + (r-l)/2;

            if(arr[m] == target) {
                ans = m;
                r = m-1;
            }
            else if(arr[m] > target) r = m-1;
            else if(arr[m] < target) l = m+1;
        }

        return ans;
    }
}
