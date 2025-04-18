package _l_02_BinearySearch._01_입문;

import java.util.Arrays;

public class _01_원소_찾기 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 7, 3, 5};
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 7));
    }


    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(arr[mid] == target) return mid;
            else if (arr[mid] > target) right = mid-1;
            else left = mid+1;
        }

        return -1;
    }
}
