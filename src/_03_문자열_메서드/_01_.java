package _03_문자열_메서드;

public class _01_ {
    public static void main(String[] args) {
        String str = "123456-1234567";

        String str1 = str.substring(0, str.indexOf('-')+1);
        String str2 = "*".repeat(7);

        System.out.println(str1+str2);
    }
}
