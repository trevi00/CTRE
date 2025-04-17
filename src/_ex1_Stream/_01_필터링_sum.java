package _ex1_Stream;

import java.util.Arrays;
import java.util.List;

public class _01_필터링_sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result = list.stream()
                .filter(n -> n%2 == 0)
                .mapToInt(n -> n*n)
                .sum();



    }
}
