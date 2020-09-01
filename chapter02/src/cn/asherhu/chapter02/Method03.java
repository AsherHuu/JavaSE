package cn.asherhu.chapter02;

/*
    ***
    ***
    ---------
    ****
 */
public class Method03 {
    public static void main(String[] args) {
        /*
            调用方法传入的参数叫做实际参数，简称实参
         */
        printStar(2,3);
        System.out.println("=============");
        printStar(1,4);
    }

    /*
        方法声明的时候添加的参数叫做形式参数，简称形参
        方法中声明的变量叫做局部变量
        类体中，方法外，声明的变量叫做成员变量
     */
    public static void printStar(int rows,int cols) {
        for (int k = 1; k <= rows; k++) {
            for (int l = 1; l <= cols; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

