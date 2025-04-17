package _z_백준._05_문자와_문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class _10_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();

        // 문자 그룹별로 한 번에 매핑
        String[] dial = {
                "ABC", "DEF", "GHI", "JKL",
                "MNO", "PQRS", "TUV", "WXYZ"
        };

        for (int i = 0; i < dial.length; i++) {
            for (char ch : dial[i].toCharArray()) {
                map.put(ch, i + 2);  // 번호는 2부터 시작
            }
        }

        String str = br.readLine();
        int sum = 0;

        for (char ch : str.toCharArray()) {
            sum += map.get(ch) + 1; // 걸리는 시간: 번호 + 1초
        }

        System.out.println(sum);
    }
}