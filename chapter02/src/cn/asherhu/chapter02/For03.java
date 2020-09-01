package cn.asherhu.chapter02;

/*
    1.计算1-100所有的奇数求和
    2.在屏幕中打印九九乘法表
 */
public class For03 {
    public static void main(String[] args) {
        //1.计算1-100所有的奇数求和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("1-100所有的奇数求和 = "+ sum);

        //2.在屏幕中打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.print("\n");
        }
    }
}
