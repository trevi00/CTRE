package _ex2_문자열_정규식_패턴;

public class _04_이메일_유효성_검사 {
    public static void main(String[] args) {
        String email = "hello@naver.com";
        System.out.println(email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")); // true
    }
}
