package cn.asherhu.fstatic;

public class Employee {
    private String name;

    //静态变量
    static  String company = "阿里巴巴";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
