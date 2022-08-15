package chapter10.section6;

/**
 * @author wangyc
 * @version 1.11
 * @description 《java语言程序设计》P337页示例学习：设计栈类
 * @data 2022/8/15 20:24
 */
public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // Construct a stack with the specified capacity
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    // Push a new integer to the top of the stack
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    // Return and remove the top element from the stack
    public int pop() {
        return elements[--size];
    }

    // Return the top element from the stack
    public int peek() {
        return elements[size - 1];
    }

    // Test whether the stack is empty
    public boolean empty() {
        return size == 0;
    }

    // Return the number of elements in the stack
    public int getSize() {
        return size;
    }
}
