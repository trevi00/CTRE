package _00_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_String {
    public static void main(String[] args) {
        /*
✅ 문자열 메서드 정리 (암기 X, 상황별 사용 기준)
상황	메서드	예시
문자 하나씩 보기	.charAt(i)	str.charAt(0)
자르기	.substring(start, end)	str.substring(1, 4)
찾기	.indexOf("a")	첫 a 위치
비교	.equals("abc")	문자열 비교
대체	.replace("a", "b")	모든 a를 b로
나누기	.split(" ")	공백 기준 자르기
길이	.length()	문자열 길이*/

        /*
   The quick brown fox jumps over the lazy dog
123456-1234567
banana apple avocado
*/
        // 문제 1
//   The quick brown fox jumps over the lazy dog

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        str1 = str1.trim();
        String[] split = str1.split(" ");
        System.out.println(split.length);

        // 문제 2
//123456-1234567
        String str2 = sc.nextLine();
        String front = str2.substring(0, str2.indexOf('-') + 1); // "123456-"
        String masked = "*".repeat(str2.length() - front.length()); // 뒷자리 *로 만들기
        System.out.println(front + masked); // 출력 예: 123456-*******

        // 문제 3
        String str3 = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str3.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(map.get('a'));
    }
}
