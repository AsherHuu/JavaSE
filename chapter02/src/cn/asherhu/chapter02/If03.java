package cn.asherhu.chapter02;

import java.util.Scanner;

/*
    根据用户输入的用户名和密码来判断是否登录成功
    用户名和密码是整数类型
    用户名：1001
    密码：123
 */
public class If03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        int name = sc.nextInt();
        System.out.println("请输入密码");
        int passwd = sc.nextInt();

        //判断是否输入了正确的用户名和密码
        if (1001 == name && 123 == passwd){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
