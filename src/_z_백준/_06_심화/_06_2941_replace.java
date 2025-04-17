package _z_백준._06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06_2941_replace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = {
                "c=", "c-", "dz=", "d-",
                "lj", "nj", "s=", "z="
        };

        String input = br.readLine();

        for(String ch : strs){
            input = input.replace(ch, "*");
        }

        System.out.println(input.length());
    }
}
