package chapter7.section5;

import java.util.Arrays;

import static java.lang.System.arraycopy;

/**
 * @author wangyc
 * @version 1.11
 * @description 使用java.lang.System类的arraycopy方法复制数组
 * @data 2022/8/11 16:07
 */
public class ArrayCopy {

    public static void main(String[] args) {
        Integer[] a = new Integer[10];
        Integer[] b = new Integer[5];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        arraycopy(a, 0, b, 0, 5);
        System.out.println(Arrays.toString(b));

        int s = 1;
        s = 2;
        System.out.println(s);
    }
}
