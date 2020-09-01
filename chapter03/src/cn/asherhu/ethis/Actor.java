package cn.asherhu.ethis;

/*
    演员
 */
public class Actor {
    private String name;

    /*
        局部变量和成员变量如果重名了，在方法中优先使用局部变量
        如果要使用成员变量，则需要通过this.变量名的方式
     */
    public void act1(){
        //定义一个局部变量name
        String name = "周杰伦";
        System.out.println("name=" + name);
        System.out.println("this.name=" + this.name);
    }

    public void act2(){
        System.out.println("act2 name=" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
