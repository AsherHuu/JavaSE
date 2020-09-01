package cn.asherhu.chapter02;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("我喜欢打篮球");
        } else if (num == 1) {
            System.out.println("我喜欢踢足球");
        } else if (num == 2) {
            System.out.println("我喜欢打排球");
        } else {
            System.out.println("我都喜欢");
        }
    }
}
