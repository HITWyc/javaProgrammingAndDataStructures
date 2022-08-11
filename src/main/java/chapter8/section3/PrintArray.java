package chapter8.section3;

import java.util.Arrays;

/**
 * @author wangyc
 * @version 1.11
 * @description 为了测试数组的打印
 * @data 2022/8/11 21:49
 */
public class PrintArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2},
                     {2, 4}};
        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
