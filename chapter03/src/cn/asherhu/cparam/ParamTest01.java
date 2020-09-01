package cn.asherhu.cparam;

/*
    基本数据类型做为参数传递的情况
 */
public class ParamTest01 {
    public static void main(String[] args) {
        int i = 10;
        m1(i);
        System.out.println("main: " + i);
    }

    public static void m1(int i){
        //i = 88;
        i++;
        System.out.println("m1: " + i);
    }
}
