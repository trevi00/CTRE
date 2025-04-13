package _01_배열;

public class _01_배열MinMax {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 10, 3, 10};
        max(arr);
    }

    static void max(int[] arr){
        int max = arr[0];
        int maxAdi = 0;
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxAdi = i;
            }
        }

        System.out.println(max + " " + maxAdi);
    }
}
