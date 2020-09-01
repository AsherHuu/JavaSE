package cn.asherhu.cparam;

/*
    引用数据类型作为方法参数传递
 */
public class ParamTest02 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(20);
        m1(animal);
        System.out.println("main: " + animal.getAge());
    }

    public static void m1(Animal a){
        a.setAge(18);
        System.out.println("m1: " + a.getAge());
    }
}
