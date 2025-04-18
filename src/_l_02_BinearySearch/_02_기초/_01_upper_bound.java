package _l_02_BinearySearch._02_기초;

public class _01_upper_bound {
    // 마지막 등장 위치 찾기
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};

        System.out.println(binarySearch_last(arr, 2)); // 출력: 3
        System.out.println(binarySearch_last(arr, 3)); // 출력: 4
        System.out.println(binarySearch_last(arr, 5)); // 출력: -1

    }

    static int binarySearch_last(int[] arr, int t){
        int l =0, r = arr.length-1;
        int ans = -1;

        while(l <= r){
            int m = l + (r-l)/2;

            if(arr[m] == t) {
                ans = m;
                l = m+1;
            }
            else if(arr[m] > t) r = m-1;
            else l = m+1;
        }

        return ans;
    }
}
