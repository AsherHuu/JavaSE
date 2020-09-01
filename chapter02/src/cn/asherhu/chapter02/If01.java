package cn.asherhu.chapter02;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();

        //判断年龄是否小于18岁
        if (age < 18){
            System.out.println("您的年龄小于18岁");
        }
    }
}
