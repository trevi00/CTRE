package _z_백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderMaster {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 수 받기
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            // 공백으로 나뉜 입력 받을 때
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 출력은 StringBuilder에 모아두기
            sb.append(A + B).append('\n');
        }

        // 가변 입력일 경우
        /*
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A + B).append('\n');
        }
*/

        // 한 번에 출력
        System.out.print(sb.toString());
    }
}
