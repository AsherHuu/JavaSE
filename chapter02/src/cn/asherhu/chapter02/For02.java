package cn.asherhu.chapter02;

public class For02 {
    public static void main(String[] args) {
        //死循环
        /*for (; ; ) {

        }*/
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
