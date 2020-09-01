package cn.asherhu.chapter02;

public class Method04 {
    public static void main(String[] args) {
        //接收方法计算的返回值
        int result = sumInt(10,15);
        System.out.println(result);
        System.out.println(sumInt(20, 5));
    }

    /*
        计算两个int类型的和
        定义带有返回值的方法，返回给该方法的调用者
     */
    public static int sumInt(int i,int j) {
        int k = i + j;
        return k;
    }
}
