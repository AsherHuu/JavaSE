package cn.asherhu.dconstructor;

public class Constructor01 {
    public static void main(String[] args) {
        User user1 = new User();

        //调用有参构造
        User user2 = new User("asherhu",18);
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
    }
}
