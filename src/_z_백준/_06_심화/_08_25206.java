package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _08_25206 {
    public static void main(String[] args) throws IOException {
        // 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double sum = 0;
        double sum2 = 0;

        for(int i = 0; i < 20; i++){
            String[] input = br.readLine().split(" ");

            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if(grade.equals("P")) continue;

            double point = map.get(grade);

            sum += credit*point;
            sum2 += credit;
        }

        System.out.println(sum/sum2);
    }
}
