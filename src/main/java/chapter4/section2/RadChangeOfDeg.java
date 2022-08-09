package chapter4.section2;

import static java.lang.Math.*;

/**
 * @author wangyc
 * @version 1.11
 * @description 角度和弧度的互相转化
 * @data 2022/8/9 15:50
 */
public class RadChangeOfDeg {
    public static void main(String[] args) {
        double rad = PI / 2;
        double deg = toDegrees(rad);
        System.out.println(deg);
    }
}
