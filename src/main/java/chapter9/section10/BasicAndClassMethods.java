package chapter9.section10;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author wangyc
 * @version 1.11
 * @description 方法对基本类型和对象引用的不同
 * @data 2022/8/12 11:05
 */
public class BasicAndClassMethods {
    public static void main(String[] args) {
        Integer a = 5;
        int b = 5;
        returnInteger(a);
        returnInt(b);
        System.out.println(a);
        System.out.println(returnInteger(a));
        System.out.println(b);
        System.out.println(returnInt(b));
    }

    @Contract(pure = true)
    @NotNull
    public static Integer returnInteger(Integer integer) {
        integer += 6;
        return integer;
    }

    public static int returnInt(int it){
        it += 10;
        return it;
    }
}
