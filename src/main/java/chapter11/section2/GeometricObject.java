package chapter11.section2;

import java.util.Date;

/**
 * @author wangyc
 * @version 1.11
 * @description 为了学习《Java语言程序设计》P367页父类与子类的内容
 * @data 2022/8/16 15:55
 */
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private final java.util.Date dateCreated;

    /* Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /* Construct a geometric object with the specified color
    *  and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /* Return color */
    public String getColor() {
        return color;
    }

    /* Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /* Return filled. Since filled is boolean, its getter method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /* Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /* Get dateCreated */
    public Date getDateCreated() {
        return dateCreated;
    }

    /* Return a string representation of this object */

    @Override
    public String toString() {
    return "created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
