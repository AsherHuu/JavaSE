package cn.asherhu.chapter02;

public class Method02 {
    public static void main(String[] args) {
        Method02 method02 = new Method02();
        method02.printStar();
        System.out.println("===========");
        method02.printStar();
    }

    public void printStar() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
