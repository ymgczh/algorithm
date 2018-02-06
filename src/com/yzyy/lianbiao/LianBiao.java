package com.yzyy.lianbiao;

/**
 * @Author: YMGC
 * @Description: 链表
 * @Date: Created in 15:18 2018/2/5
 * @Since: 2018/2/5
 */
public class LianBiao {

    //链表头
    private Node first;

    public LianBiao() {
        this.first = null;
    }

    /**
     * 在头结点后插入
     * @param val
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
//        if (first == null) {
//            first = node;
//        } else {
//            node = first.next;
//            first = node;
//        }
        node.next = first;
        first = node;
    }

    /**
     * 头结点后删除
     * @return
     */
    public Node deleteFirst() {
        Node del = first;
        first = del.next;
        return del;
    }

    /**
     * 显示链表数据
     */
    public void display() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    /**
     * 查找方法
     * @param val
     * @return
     */
    public Node find(int val) {
        Node current = first;
        while (current.val != val) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        return current;
    }

    public Node delete(int val) {
        Node previous = null;
        Node current = first;
        while (current.val != val) {
            if (current.next == null) {
                return null;
            }
            previous = current;
            current = current.next;
        }

        if (current == first) {
            first = current.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }
}
