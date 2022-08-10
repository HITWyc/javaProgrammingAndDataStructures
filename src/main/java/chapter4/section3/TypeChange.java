package chapter4.section3;

/**
 * @author wangyc
 * @version 1.11
 * @description 字符型数据与数值型数据之间的类型转换
 * @data 2022/8/9 18:53
 */
public class TypeChange {
    public static void main(String[] args) {
        char ch = (char)0XAB0041;
        System.out.println(ch);

        char ch1 = (char)65.25;
        System.out.println(ch1);

        int a =  'A';
        System.out.println(a);

        int b = Integer.parseInt("12") ;
        System.out.println(b);

        var v = "a";
        System.out.println(v);

        var s = 1;
        System.out.println(s);

        int c = s + b;
        System.out.println(c);
    }
}
