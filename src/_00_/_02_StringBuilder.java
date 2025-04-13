package _00_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _02_StringBuilder {
    /*
.append(str)	문자열 추가	sb.append("abc");
.insert(idx, str)	위치에 삽입	sb.insert(2, "x");
.delete(start, end)	부분 삭제	sb.delete(0, 3);
.reverse()	문자열 뒤집기	sb.reverse();
.toString()	String 변환	sb.toString()*/
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" Ks");
        sb.insert(str.length() + 1, "K");
        System.out.println(sb);

        sb.delete(str.length(), str.length() + 3);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문제 1
        System.out.println("문제 1 :");
        String str1 = br.readLine();
        String[] words = str1.split(" ");
        StringBuilder sb1 = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            sb1.append(words[i]);
            if(i > 0) sb1.append(" ");
        }
        System.out.println(sb1.toString());


        // 문제 2
        System.out.println("문제 2 :");
        String str2 = br.readLine();
        StringBuilder sb2 = new StringBuilder(str2);

        System.out.println(sb2.toString().equals(sb2.reverse().toString()));

        // 문제 3
        System.out.println("문제 3 : ");
        String str3 = br.readLine();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str3.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
