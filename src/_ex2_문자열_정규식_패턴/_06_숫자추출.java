package _ex2_문자열_정규식_패턴;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_숫자추출 {
    public static void main(String[] args) {
        String data = "Order123Item456";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(data);

        while (m.find()) {
            System.out.println("숫자: " + m.group());
        }
    }
}
