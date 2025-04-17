package _ex2_문자열_정규식_패턴;

public class _01_패턴 {
    public static void main(String[] args) {
        String email = "test@example.com";
        boolean result = email.matches(".+@.+\\..+"); // true

        System.out.println(result);
    }
}
