package com.yzyy.shuangduanlb;

/**
 * @Author: YMGC
 * @Description: 双向链表
 * @Date: Created in 15:18 2018/2/6
 * @Since: 2018/2/5
 */
public class DoubleLinkedList {

    //链表头
    private Node first;
    //表尾
    private Node last;

    public DoubleLinkedList() {
        this.first = null;
        this.last = null;
    }

    /**
     * 在头结点后插入
     * 为空则设置尾节点为新加入节点
     * 否则设置头结点的前一个为新添加的节点
     * @param val
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            last = node;
        } else {
            first.previous = node;
        }
        node.next = first;
        first = node;
    }

    /**
     * 从尾部节点插入
     */
    public void insertLast(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
            node.previous = last;
        }
        last = node;
    }

    /**
     * 头结点后删除
     * @return
     */
    public Node deleteFirst() {
        Node del = first;
        if (first.next == null) {
            last = null;
        } else {
            del.next.previous = null;
        }
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
        Node current = first;
        while (current.val != val) {
            if (current.next == null) {
                return null;
            }
            current = current.next;
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        return current;
    }

    public boolean isEmpty(){
        return first == null;
    }

    /**
     * 删除最后一个节点
     */
    public void deleteLast() {
        if (!isEmpty()) {
            if (first.next == null) {
                first = null;
                last = null;
            }
            else {
//                Node current = last;
//                last.previous = current.previous.previous;
//                last = current.previous;
//                current.previous.next = last;
//                current = null;
                last.previous.next = null;
            }
            last = last.previous;
        }
    }
}
