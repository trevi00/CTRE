package _00_._01_250428;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_set {
    public static void main(String[] args) {
        System.out.println(removeDuplicateNumbers(new int[]{1, 2, 2, 2, 3, 4, 4}));
    }

    static List<Integer> removeDuplicateNumbers(int[] nums){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                list.add(num);
            }
        }
        return list;
    }
}
