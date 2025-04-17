package _03_문자열_메서드;

public class _03_ {
    public static void main(String[] args) {
        String str = "I love Java programming language";

        String[] strs = str.split(" ");

        String maxlen = "";

        for(String st : strs){
            if(maxlen.length() < st.length()){
                maxlen = st;
            }
        }

        System.out.println(maxlen);
    }
}
