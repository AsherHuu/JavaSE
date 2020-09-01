package cn.asherhu.fstatic;

/*
    笔试题
 */
public class Static03 {
    static int i = 10; //放到上面可以

    static {
        System.out.println(i);
    }

    //static int i = 10;//放到下面不行，因为静态加载的时候是从上往下加载，所以上面输出语句时候会报错。
}
