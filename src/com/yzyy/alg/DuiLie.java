package com.yzyy.alg;

/**
 * 队列 先进先出 ——Queue
 * Created by Administrator on 2018/2/4 0004.
 */
public class DuiLie {

//    底层使用数据
    private int[] arr;
//    有效数据的大小
    private int elements;
    //对头
    private int front;
    //队尾
    private int end;

    public DuiLie() {
        arr = new int[10];
        elements = 0;
        front = 0;
        end = -1;
    }
    public DuiLie(int maxSize) {
        arr = new int[maxSize];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 添加数据-从队尾开始插入
     */
    public void insert(int val) {
        if (end == arr.length - 1) {
            end = -1;
        }
        arr[++ end] = val;
        elements ++;
    }

    /**
     * 删除 -从对头删除
     */
    public int remove() {
        int val = arr[front ++];
        if (front == arr.length) {
            front = 0;
        }
        elements --;
        return val;
    }

    /**
     * 查看数据
     */
    public int peek() {
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return elements == 0;
    }

    /**
     * 判断是否满
     */
    public boolean isFull() {
        return elements == arr.length;
    }
}
