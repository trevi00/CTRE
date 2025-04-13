package _01_배열;

public class _03_배열_문자열에서_특정_문자_개수_세기 {
    public static void main(String[] args) {
        String s = "abracadabra";

        // a
        System.out.println(cntCharIgnoreCase('a', s));
    }

    static int cntCharIgnoreCase(char ch, String s){
        int cnt = 0;
        ch = Character.toLowerCase(ch);
        for(char c : s.toCharArray()){
            if(Character.toLowerCase(c) == ch){
                cnt++;
            }
        }
        return cnt;
    }

}
