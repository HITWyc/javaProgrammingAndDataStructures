package chapter10.section6;

/**
 * @author wangyc
 * @version 1.11
 * @description 为了测试StackOfInteger类
 * @data 2022/8/15 20:40
 */
public class TestStackOfInteger {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
