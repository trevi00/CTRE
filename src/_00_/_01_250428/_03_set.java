package _00_._01_250428;

import java.util.HashSet;
import java.util.Set;

public class _03_set {
    public static void main(String[] args) {
        System.out.println(containsTarget(new int[]{1, 2, 3, 4, 5}, 3));
    }

    static boolean containsTarget(int[] nums, int target){
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        return set.contains(target);
    }
}
