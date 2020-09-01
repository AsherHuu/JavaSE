package cn.asherhu.chapter02;

/*
    方法重载发生的条件

    发生在同一个类中.
    方法名相同
    参数列表不同(类型，个数，顺序)
    注意：

    方法重载和返回值类型无关
    方法重载和方法的修饰符列表无关。
 */
public class Method07 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.1,2.2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
