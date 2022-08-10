package chapter4.section4;

/**
 * @author wangyc
 * @version 1.11
 * @description 测试一下String方法
 * @data 2022/8/10 8:26
 */
public class FindOfString {
    public static void main(String[] args) {
        String a = "abcdefg ";
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        System.out.println(a.trim());

        String b = "hijklmn";
        String c = a.concat(b);
        System.out.println(c);

        b += a;
        System.out.println(b);
        System.out.println(b.toUpperCase());
    }
}
