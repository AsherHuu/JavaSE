package cn.asherhu.ethis;

/*
    歌手
 */
public class Singer {
    private String name;

    /*
        通过this区分成员变量和局部变量
     */
    public void setName(String name){
        this.name = name;
    }

    //this表示当前对象的引用，所以可以通过this，访问成员变量
    public String getName(){
        return  this.name;
    }

    //成员方法也可以通过this.来调用
    public void m1(){
        this.m2();
    }

    public void m2(){
        System.out.println("m2");
    }
}
