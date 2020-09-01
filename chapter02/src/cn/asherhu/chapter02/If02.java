package cn.asherhu.chapter02;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天是否下雨");
        boolean flag = sc.nextBoolean();

        //判断是否下雨来决定带不带伞
        if (flag){
            System.out.println("带伞");
        }else {
            System.out.println("不带伞");
        }
    }
}
