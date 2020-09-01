package cn.asherhu.fstatic;

/*
    静态语句块，静态代码块
 */
public class Static02 {
    //静态代码块
    static {
        System.out.println("静态代码块1");
    }
    static {
        System.out.println("静态代码块2");
    }
    static {
        System.out.println("静态代码块3");
    }

    //构造方法
    public Static02() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Static02 s1 = new Static02();
        new Static02();
    }
}
