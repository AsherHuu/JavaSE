package cn.asherhu.chapter02;

public class Method05 {
    public static void main(String[] args) {

    }

    public static int sumInt(int i, int j) {
        int k = i + j;
        return k;//程序执行到方法中的return，该方法就结束了，并且会返回int类型k的值
    }

    public static int test1(){
        return 100;
        //System.out.println("123");
    }

    public static void test2() {
        return;//可以return，后面不加任何内容
    }
}
