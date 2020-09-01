package cn.asherhu.gextends;

/*
    儿子类
 */
public class SuperClass extends SuperSuperClass{

    public void m1(){
        System.out.println("父类中的m1方法");
    }

    //子类无法访问
    private void m2(){
        System.out.println("父类中的m2方法");
    }
}