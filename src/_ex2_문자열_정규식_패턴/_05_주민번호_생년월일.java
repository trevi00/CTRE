package _ex2_문자열_정규식_패턴;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_주민번호_생년월일 {
    public static void main(String[] args) {
        String ssn = "900101-1234567";
        Pattern p = Pattern.compile("^(\\d{6})-\\d{7}$");
        Matcher m = p.matcher(ssn);

        if (m.find()) {
            System.out.println("생년월일: " + m.group(1)); // "900101"
        }

    }
}
