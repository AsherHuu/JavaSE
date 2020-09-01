package cn.asherhu.chapter02;

import java.util.Scanner;

/*
    在控制台输入若干正整数，当输入-1的时候表示结束，将这些输入的最大的数打印
 */
public class While01 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个正整数");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
        }*/
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int max = 0;
        while (flag) {
            System.out.println("请输入一个正整数");
            int num = sc.nextInt();
            if (num == -1) {
                flag = false;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("输入的最大值是：" + max);
    }
}
