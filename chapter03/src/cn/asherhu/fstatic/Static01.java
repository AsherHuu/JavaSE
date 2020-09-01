package cn.asherhu.fstatic;

/*
    静态方法
 */
public class Static01 {

    int i;

    public static void main(String[] args) {
        //m1();//静态方法只能直接调用静态方法
        Static01 s = new Static01();
        s.m1();///静态方法可以通过对象名.成员方法名的方式调用
        m2();
        Static01.m2();

        //s.m2(); 不推荐
    }

    public void m1(){
        System.out.println(i);
        System.out.println("m1");
    }

    public  static void  m2(){
        //System.out.println(i);不能使用非静态的成员变量
        System.out.println("m2");
    }
}
