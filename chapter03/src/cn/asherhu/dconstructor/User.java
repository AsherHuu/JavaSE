package cn.asherhu.dconstructor;

public class User {
    private String name;

    private int age;

    //定义无参构造
    public User(){
        System.out.println("User 无参构造函数");
    }

    /*
        构造方法可以构成重载
     */
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    //定义get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
