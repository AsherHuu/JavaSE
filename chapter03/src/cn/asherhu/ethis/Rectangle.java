package cn.asherhu.ethis;

/*
    长方形
 */
public class Rectangle {
    //宽
    private int with;

    //高
    private int high;

    //计算周长
    public int getLength(){
        return 2 * (with + high);
    }

    //计算面积
    public int getArea(){
        return with * high;
    }

    public Rectangle() {
    }

    public Rectangle(int with, int high) {
        this.with = with;
        this.high = high;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
