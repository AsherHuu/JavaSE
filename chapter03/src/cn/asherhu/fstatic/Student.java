package cn.asherhu.fstatic;

public class Student {
    public Student() {
        System.out.println("构造方法");
    }

    //构造代码块
    //每创建一个对象都会执行，优先于构造方法执行
    {
        System.out.println("构造代码块");
    }

    //静态代码块
    static {
        System.out.println("静态代码块");
    }
}
