package _01_배열;

public class _04_문자열_유효성_검사 {
    public static void main(String[] args) {
        String[] email = {"hello@example.com" // ✅ true
        , "helloexample.com"  // ❌ false
        , "hello@com."        // ✅ true
        , "hello.com@naver"  // ❌ false
        };

        /* 조건 (아래 조건을 모두 만족해야 true)
        '@' 문자가 포함되어 있어야 한다
        '.' 문자도 포함되어 있어야 한다
        '@'는 '.'보다 앞에 있어야 한다*/
    }

    static boolean isValidEmail(String email){
        if(email.contains("@") && email.contains(".") && email.indexOf("@") < email.indexOf(".")){
            return true;
        }

        return false;
    }
}
