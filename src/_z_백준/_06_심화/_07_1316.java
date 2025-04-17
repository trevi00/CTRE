package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _07_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int t = 0; t < N; t++) {
            String str = br.readLine();
            boolean[] visited = new boolean[26];
            boolean isGroup = true;

            char prev = '\0';  // 초기값 (null 문자)

            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);

                // 이전 문자와 다르고, 이미 나왔던 문자라면 그룹 단어 아님
                if (curr != prev) {
                    if (visited[curr - 'a']) {
                        isGroup = false;
                        break;
                    }
                    visited[curr - 'a'] = true;
                }

                prev = curr; // 이전 문자 갱신
            }

            if (isGroup) count++;
        }

        System.out.println(count);
    }
}