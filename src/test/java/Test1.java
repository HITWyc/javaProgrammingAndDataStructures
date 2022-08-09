/**
 * @author wangyc
 * @version 1.11
 * @description 为了测试一下强制类型转换
 * @data 2022/8/8 19:01
 */
public class Test1 {
    public static void main(String[] args) {
        String a = "13";
        int b = Integer.parseInt(a);
        String c = String.valueOf(b);
        String d = "12.5";
        double e = Double.parseDouble(d);
//        String f = "a";
//        double g = Double.parseDouble(f);

//        System.out.println(g);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
