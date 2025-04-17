package _ex3_Comparator;

import java.util.Arrays;
import java.util.List;

public class _01_내림차순 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1);
        list.sort((a, b) -> b - a); // 내림차순

    }
}
