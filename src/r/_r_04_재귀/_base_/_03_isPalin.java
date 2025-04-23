package r._r_04_재귀._base_;

public class _03_isPalin {
    static String str;

    public static void main(String[] args) {
        str = "abcdcba";

        System.out.println(isPalin(0, str.length()-1));

        str = "abcdr";

        System.out.println(isPalin(0, str.length()-1));
    }

    static boolean isPalin(int s, int e){
        if(s>=e) return true;

        if(str.charAt(s) != str.charAt(e)) return false;

        return isPalin(s+1, e-1);
    }
}
