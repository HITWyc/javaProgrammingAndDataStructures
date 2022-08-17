package chapter11.section2;

/**
 * @author wangyc
 * @version 1.11
 * @description 测试创建的Circle类和Rectangle类对象并调用对象上的方法
 * @data 2022/8/17 10:02
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rect = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rect.toString());
        System.out.println("The area is " + rect.getArea());
        System.out.println("The perimeter is " + rect.getPerimeter());
    }
}
