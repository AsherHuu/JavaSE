package cn.asherhu.chapter02;

/*
    方法的调用
 */
public class Method06 {
    public static void main(String[] args) {
        //方法可以跨类调用
        //类名，方法名
        int result = Method05.sumInt(15,10);
        System.out.println(result);
        //会调用当前类中的方法
        int result2 = sumInt(10,15);
        System.out.println(result2);
    }

    public static int sumInt(int i,int j) {
        int k = i + j;
        return k;
    }
}
