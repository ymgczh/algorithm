package com.yzyy.shuangduanlb;

/**
 * @Author: YMGC
 * @Description: Node节点
 * @Date: Created in 15:19 2018/2/5
 * @Since: 2018/2/5
 */
public class Node {

    //数据
    public int val;
    //节点域-指针域
    public Node next;
    //前一个节点域
    public Node previous;

    public Node(int val) {
        this.val = val;
    }

    public void display() {
        System.out.println("Val: " + val + " ");
    }
}
