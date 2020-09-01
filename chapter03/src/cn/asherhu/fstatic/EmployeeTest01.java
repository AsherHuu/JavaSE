package cn.asherhu.fstatic;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee e = new Employee();
        //可以通过对象名.静态变量名方法，但是不推荐使用
        System.out.println(e.company);

        //直接类名.静态变量名,推荐使用
        System.out.println(Employee.company);

        e = null;

        System.out.println(e.company);//不会报空指针，静态变量跟对象没有关系
        //e.setName("张三"); //会报NullPointerException 空指针
    }
}
