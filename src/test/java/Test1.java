import java.util.ArrayList;
import java.util.List;

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

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.set(0, 2);
        System.out.println(list.get(0));
        System.out.println(list.size());

        Integer integer = Integer.valueOf("12");
        int integer2 = Integer.parseInt("32");
        System.out.println(integer + "dddd" + integer2);
        String st1 = "33";
        integer = Integer.valueOf(st1);
        System.out.println(integer);
        integer = Integer.parseInt(st1);
        System.out.println(integer * 2);

        String st2 = "welcome to java";
        String st3 = "welcome to java";
        System.out.println("st2 == st3 " + (st2 == st3));

        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        for (String token : tokens) {
            System.out.println(token);
        }

        double str1 = Double.parseDouble("15");
        System.out.println(str1);

        String str2 = String.valueOf(15);
        double dou1 = Double.parseDouble(str2);
        System.out.println(dou1);

    }
}
