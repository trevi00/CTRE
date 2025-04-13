package _00_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_BufferedReader {
    public static void main(String[] args) throws IOException {
        // 입력 속도가 매우 빠름
        //대량의 데이터 처리 시 필수
        //모든 입력은 문자열 → 직접 파싱 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); // 한 줄 입력
        int num = Integer.parseInt(line); // 숫자로 바꾸기

    }
}
