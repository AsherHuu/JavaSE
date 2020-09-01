package cn.asherhu.fstatic;

/*
    代码块
 */
public class Block01 {
    //静态代码块
    static {
        System.out.println("block中的静态代码块");
    }

    public static void main(String[] args) {
        //局部代码块
        {
            int x = 10;
            System.out.println(x);
        }

        //无法访问局部代码块中声明的变量
        //System.out.println(x);
        Student s1 = new Student();
        Student s2 = new Student();
    }
}