package cn.asherhu.gextends;

public class Extends01 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.m3();
        s.m1();//父类中的m1方法
        s.m0();//爷爷类中的m0方法
    }
}
