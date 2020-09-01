package cn.asherhu.hoverride;

/*
    狗
 */
public class Dog extends Animal{
    /*
        生成重写的快捷键ctrl+o(字母)

        @Override 叫做注解
     */
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗狗睡觉");
    }
}
