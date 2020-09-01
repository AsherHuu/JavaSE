package cn.asherhu.aclassandobject;

/*
     byte,short,int,long   0
    float,double  0.0
    boolean false
    char     \u0000

    引用数据类型
    String null
 */
public class Variable {

    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean boo;
    //引用数据类型，所有的引用数据类型默认值都是null
    String str;

    public static void main(String[] args) {
        Variable var = new Variable();
        System.out.println(var.b);//0
        System.out.println(var.s);//0
        System.out.println(var.i);//0
        System.out.println(var.l);//0
        System.out.println(var.f);//0.0
        System.out.println(var.d);//0.0
        System.out.println(var.boo);//false
        System.out.println(var.str);//null
        System.out.print(var.c);//char的默认值是\u0000
    }
}