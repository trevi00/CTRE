package _ex1_Stream;

import java.util.Arrays;

public class _02_필터링_정렬 {
    public static void main(String[] args) {
        String[] words = {"apple", "cat", "banana", "dog", "elephant"};

        Arrays.stream(words)
                .filter(w -> w.length() >= 4)
                .sorted()
                .forEach(System.out::println);
    }
}
