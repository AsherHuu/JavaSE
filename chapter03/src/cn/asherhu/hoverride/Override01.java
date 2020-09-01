package cn.asherhu.hoverride;

public class Override01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //优先调用子类中的方法
        cat.eat();
        cat.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
