package _ex2_문자열_정규식_패턴;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_부분매칭_그룹추출_반복검사 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+"); // 숫자 하나 이상
        Matcher m = p.matcher("abc123xyz");

        while (m.find()) {
            System.out.println(m.group()); // "123"
        }
    }
}
