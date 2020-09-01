package cn.asherhu.ethis;

/*
    日期类
 */
public class MyDate {
    private int year;

    private int month;

    private int day;

    //只能在构造方法中调用其他构造方法
 /*   public void m1(){
        this(1970,1,1);
    }*/

    /*
        在通过无参构造创建对象的时候，设定默认日期:1970-1-1
     */
    public MyDate(){
        //调用有参构造
        //MyDate(1970,1,1);构造方法不能这样调用
        //通过this调用构造方法
        this(1970,1,1);

        /*this.year = 1970;
        this.month = 1;
        this.day = 1;*/
    }

    /*
        有参构造
        给成员变量进行初始化
     */
    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //alt+insert生成get和set方法
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
