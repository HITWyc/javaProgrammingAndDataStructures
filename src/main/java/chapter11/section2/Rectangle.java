package chapter11.section2;

/**
 * @author wangyc
 * @version 1.11
 * @description GeometricObject类的子类
 * @data 2022/8/17 9:50
 */
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /* Return width */
    public double getWidth() {
        return width;
    }

    /* Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /* Return height */
    public double getHeight(){
        return height;
    }

    /* Set a new height */
    public void setHeight(double height){
        this.height = height;
    }

    /* Return area */
    public double getArea() {
        return width * height;
    }

    /* Return perimeter */
    public double getPerimeter() {
        return 2 * (width * height);
    }
}
