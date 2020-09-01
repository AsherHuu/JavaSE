package cn.asherhu.hoverride;

/*
    猫 继承动物类
    使用继承关系的时候要符合常理
 */
public class Cat extends Animal{
    //重写父类中的eat方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //重写父类中的sleep方法
    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }
}
