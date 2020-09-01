package cn.asherhu.chapter02;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //获取用户输入的字符串
        System.out.println("请输入你的名字");
        //String name = scanner.next(); 只能获取空格之前的内容
        //String name = scanner.nextLine();获取整行内容,已回车视为结束

        //八个基本数据类型除了char，另外七个都可以通过Scanner获取到
        String name1 = scanner.next();//已空格视为结束
        String name2 = scanner.next();
        System.out.println(name1);
        System.out.println(name2);

        //获取用户输入的整数
        System.out.println("请输入整数");
        int num = scanner.nextInt();
        System.out.println(num);

    }
}
