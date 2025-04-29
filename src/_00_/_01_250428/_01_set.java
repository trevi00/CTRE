package _00_._01_250428;

import java.util.HashSet;
import java.util.Set;

public class _01_set {
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharacters("abcabcde"));
    }

    static String removeDuplicateCharacters(String s){
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(!seen.contains(c)){
                seen.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
