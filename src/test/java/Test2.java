import java.util.Arrays;

/**
 * @author wangyc
 * @version 1.11
 * @description 测试一些用法
 * @data 2022/8/17 14:44
 */
public class Test2 {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 4},
                     {5, 6, 7},
                     {8, 9, 0}};
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        System.out.println(Arrays.deepToString(a));
    }
}
