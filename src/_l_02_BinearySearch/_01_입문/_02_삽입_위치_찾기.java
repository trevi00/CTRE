package _l_02_BinearySearch._01_입문;

public class _02_삽입_위치_찾기 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        System.out.println(binarySearch(arr, 5)); // 2
        System.out.println(binarySearch(arr, 0)); // 0
        System.out.println(binarySearch(arr, 10)); // 4
        System.out.println(binarySearch(arr,6));
    }


    static int binarySearch(int[] arr, int t){
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = l + (r - l)/2;

            if(arr[mid] == t) return mid;
            else if (arr[mid] > t) r = mid-1;
            else l = mid+1;
        }

        return l;
    }
}
