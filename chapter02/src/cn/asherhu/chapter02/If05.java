package cn.asherhu.chapter02;

import java.util.Scanner;

/*
    通过成绩，判断并输出成绩的等级：
    如果成绩在90-100之间，程序输出：A
    如果成绩在80-89之间，程序输出：B
    如果成绩在60-79之间，程序输出：C
    如果成绩在0-59之间，程序输出：D
 */
public class If05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的分数(0-100)");
        int score = sc.nextInt();
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("B");
        } else if (score <= 79 && score >= 60) {
            System.out.println("C");
        } else if (score <= 59 && score >= 0) {
            System.out.println("D");
        } else {
            System.out.println("成绩输入不合规，请重新输入");
        }
    }
}
