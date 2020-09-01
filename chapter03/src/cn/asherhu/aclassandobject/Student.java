package cn.asherhu.aclassandobject;

public class Student {
    /*
        属性用成员变量表示
        成员变量通常不初始化
     */

    //学号
    int id;

    //姓名
    String name;

    //性别
    boolean sex;

    //年龄
    int age;


    /*
        行为 用方法来表示
        方法可以不加static,如果没有static该方法叫成员方法。
     */
    //学习
    public void studay() {
        System.out.println("好好学习");
    }

    //谈恋爱
    public void makeFriend(String name) {
        System.out.println("我在跟" + name + "谈恋爱");
    }

    //做运动
    public void takeExercises(String sport) {
        System.out.println(sport);
    }
}
