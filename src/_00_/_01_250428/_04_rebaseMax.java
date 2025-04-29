package _00_._01_250428;

public class _04_rebaseMax {
    public static void main(String[] args) {
        System.out.println(findMaxLen(new String[]{"apple", "banana", "kiwi"}));
    }

    static int findMaxLen(String[] words){
        int maxLen = 0;
        for(String word : words){
            maxLen = Math.max(maxLen, word.length());
        }
        return maxLen;
    }
}
