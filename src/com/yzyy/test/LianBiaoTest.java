package com.yzyy.test;

import com.yzyy.lianbiao.LianBiao;
import com.yzyy.lianbiao.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: YMGC
 * @Description: 链表测试类
 * @Date: Created in 15:33 2018/2/5
 * @Since: 2018/2/5
 */
public class LianBiaoTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("链表显示");
    }

    @Test
    public void display() throws Exception {

        LianBiao linkList = new LianBiao();
        linkList.insertFirst(34);
        linkList.insertFirst(12);
        linkList.insertFirst(11);
        linkList.insertFirst(66);

        linkList.display();

        System.out.println();
//
//        linkList.deleteFirst();
//        linkList.display();
//        System.out.println();
        Node find = linkList.find(66);
        find.display();
    }

}