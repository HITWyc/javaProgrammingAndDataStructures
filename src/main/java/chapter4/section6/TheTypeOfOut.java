package chapter4.section6;

import static chapter6.section5.StaticMethods.*;

/**
 * @author wangyc
 * @version 1.11
 * @description 《Java语言程序设计》4.6中内容。
 * @data 2022/8/10 19:50
 */
public class TheTypeOfOut {
    public static void main(String[] args) {
        int count = 5;
        double amount = 45.56;
        System.out.printf("count is %d and amount is %4.2f%n", count, amount);
        String a = "Java is cool";
        System.out.printf("%2s%n", a);
        int b = getIntNum(52.6);
        System.out.println(b);
    }
}
