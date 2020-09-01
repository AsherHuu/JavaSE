package cn.asherhu.aclassandobject;

/*
    类是对象的抽象
    对象是类的具体
 */
public class StudentTest01 {
    public static void main(String[] args) {
        //创建一个学生对象
        //类名 对象名 = new 类名();
        //创建了一个学生类型的对象，名字叫做zhangsan
        Student zhangsan = new Student();

        //变量名.属性名
        zhangsan.age = 18;
        zhangsan.name = "张三";
        zhangsan.sex = true;
        zhangsan.id = 1001;

        System.out.println("学号:" + zhangsan.id);
        System.out.println("姓名:" + zhangsan.name);
        /*if (zhangsan.sex) {
            System.out.println("性别:男");
        } else {
            System.out.println("性别:女");
        }*/
        System.out.println("性别: " + (zhangsan.sex ? "男" : "女"));
        System.out.println("年龄:" + zhangsan.age);

        //调用成员方法
        //因为student类中的方法都是成员方法，所以调用的时候需要通过对象名.方法名
        zhangsan.studay();
        zhangsan.makeFriend("美丽");
        zhangsan.takeExercises("打篮球");
    }
}
