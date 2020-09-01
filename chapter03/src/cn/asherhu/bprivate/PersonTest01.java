package cn.asherhu.bprivate;

public class PersonTest01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(22);
        p.setName("asherhu");
        System.out.println("姓名: " + p.getName());
        System.out.println("年龄: " + p.getAge());
//        p.age = -10;
//        System.out.println("年龄  " + p.age);
    }
}
