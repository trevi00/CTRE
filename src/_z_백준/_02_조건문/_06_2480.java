package _z_백준._02_조건문;

import java.util.*;

public class _06_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        for(int i = 0; i < 3; i++){
            nums[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int ans = 0;

        if(map.size() == 1){
            ans = 10000+nums[0]*1000;
        } else if (map.size() == 2) {
            int idx= 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() == 2) idx = entry.getKey();
            }
            ans = 1000 + idx*100;
        } else {
            Arrays.sort(nums);
            ans = 100*nums[2];
        }

        System.out.println(ans);
    }
}
