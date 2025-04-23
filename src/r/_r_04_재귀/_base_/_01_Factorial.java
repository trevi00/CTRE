package r._r_04_재귀._base_;

public class _01_Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println("---");
        System.out.println(getFactorial2(5));
    }

    static int getFactorial(int x){
        if(x <= 1) return 1;
        else return x*getFactorial(x-1);
    }

    static int getFactorial2(int x){
        if(x == 1) return 1;

        return x*getFactorial(x-1);
    }
}
