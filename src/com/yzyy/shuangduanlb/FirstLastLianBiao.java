package com.yzyy.shuangduanlb;

/**
 * @Author: YMGC
 * @Description: 双端链表-保留对尾部节点的引用
 * @Date: Created in 15:18 2018/2/6
 * @Since: 2018/2/5
 */
public class FirstLastLianBiao {

    //链表头
    private Node first;
    //表尾
    private Node last;

    public FirstLastLianBiao() {
        this.first = null;
        this.last = null;
    }

    /**
     * 在头结点后插入
     * @param val
     */
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            last = node;
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
                Node previous = null;
                Node current = first;
                while (current.next != null) {
                    if (current.next == last) {
                        previous = current;
                        current = current.next;
                        break;
                    }
                    current = current.next;
                }
                previous.next = null;
                last = previous;
            }
        }
    }
}
