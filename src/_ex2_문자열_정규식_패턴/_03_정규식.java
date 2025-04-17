package _ex2_문자열_정규식_패턴;

public class _03_정규식 {
    public static void main(String[] args) {
        String clean = "apple123".replaceAll("\\d+", ""); // "apple"
        System.out.println(clean);
    }
}
