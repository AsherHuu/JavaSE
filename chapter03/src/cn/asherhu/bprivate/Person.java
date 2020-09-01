package cn.asherhu.bprivate;

/*
    人
 */
public class Person {
    /*
        不允许该类的外部直接访问成员变量
     */
    private String name;

    private int age;

    /*public Person(String name,int age){
        this.name = name;
        this.age = age;
    }*/
    /*
        通过方法将成员变量暴露出来
        set和get方法
     */
    //给成员变量age赋值
    public void setAge(int _age) {
        if (_age >= 0 && _age <= 120) {
            age = _age;
        } else {
            System.out.println("年龄不合法");
        }
    }

    //获取成员变量age的值
    public int getAge() {
        return age;
    }

    //给成员变量name进行赋值
    public void setName(String _name) {
        name = _name;
    }

    //获取成员变量name的值
    public String getName() {
        return name;
    }
}
