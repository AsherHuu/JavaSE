package cn.asherhu.ethis;

public class RectangleTest01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);

        int area = rectangle.getArea();
        int length = rectangle.getLength();

        System.out.println("面积是：" + area);
        System.out.println("周长是：" + length);
    }
}
