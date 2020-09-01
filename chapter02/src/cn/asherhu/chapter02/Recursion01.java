package cn.asherhu.chapter02;

public class Recursion01 {
    public static void main(String[] args) {
        int result = sumInt(5);
        System.out.println(result);
        System.out.println(multiply(10));
    }

    public static int sumInt(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumInt(n - 1);
        }
    }

    public static long multiply(int n){
        if (n ==1){
            return n;
        }else {
            return n * multiply(n-1);
        }
    }
}
