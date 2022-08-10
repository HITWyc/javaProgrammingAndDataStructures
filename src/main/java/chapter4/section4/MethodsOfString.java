package chapter4.section4;

/**
 * @author wangyc
 * @version 1.11
 * @description 为了学习《Java语言程序设计》中P119页4.4.7字符串比较中表4-8String对象的比较方法
 * @data 2022/8/10 10:17
 */
public class MethodsOfString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "Abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.startsWith("a"));
        System.out.println(s1.endsWith("c"));
        System.out.println(s1.contains("b"));
    }
}
