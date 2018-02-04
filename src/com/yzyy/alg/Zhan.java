package com.yzyy.alg;

/**
 * 栈练习 stack
 * Created by Administrator on 2018/2/4 0004.
 */
public class Zhan {

    //底层实现是一个数组
    private int[] arr;
    //栈顶
    private int top;

    public Zhan(){
        arr = new int[10];
        top = -1;
    }

    public Zhan(int maxSize) {
        arr = new int[maxSize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int val){
        arr[++top] = val;
    }

    /**
     * 移除数据
     */
    public int pop() {
        return arr[top --];
    }

    /**
     * 查看数据
     */
    public int peek() {
        return arr[top];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return top == arr.length - 1;
    }
}
