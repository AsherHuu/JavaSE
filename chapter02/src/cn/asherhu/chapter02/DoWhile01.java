package cn.asherhu.chapter02;

import java.util.Scanner;

/*
    模拟用户登录功能，用户名是1001，密码是123
    如果输入正确则登录成功
    否则登录失败，如果失败次数超过3次，则不允许用户登录
 */
public class DoWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        int count = 0;

        do {
            System.out.println("请输入用户名:");
            int name = sc.nextInt();
            System.out.println("请输入密码:");
            int password = sc.nextInt();

            if (1001 == name && 123 == password) {
                System.out.println("恭喜您登陆成功");
                flag = false;
            } else if (count == 2) {
                flag = false;
                System.out.println("失败次数已经超过3次，账户已被锁定");
            } else {
                count++;
                System.out.println("用户名或密码错误请重新输入");
            }
        } while (flag);
    }
}
