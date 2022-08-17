package chapter11.section9;

import chapter11.section2.Circle;
import chapter11.section2.Rectangle;

/**
 * @author wangyc
 * @version 1.11
 * @description 学习《Java语言程序设计》P384页的对象转换和 instanceof操作符的内容
 * @data 2022/8/17 15:50
 */
public class CastingDemo {
    /* Main method */
    public static void main(String[] args) {
        // Create and initialize two objects
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    public static void displayObject(Object object){
        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle)object).getArea());
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
    }
}
