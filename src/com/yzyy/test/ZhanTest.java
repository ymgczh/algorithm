package com.yzyy.test;

import com.yzyy.alg.Zhan;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 栈测试类
 * Created by Administrator on 2018/2/4 0004.
 */
public class ZhanTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("结束");
    }

    @Test
    public void push() throws Exception {
        Zhan zhan = new Zhan(4);
        zhan.push(23);
        zhan.push(2);
        zhan.push(21);
        zhan.push(1);
        System.out.println(zhan.isEmpty());
        System.out.println(zhan.isFull());
        System.out.println(zhan.peek());
        while (!zhan.isEmpty()) {
            System.out.print(zhan.pop() + ",");
        }
    }

    @Test
    public void pop() throws Exception {
    }

    @Test
    public void peek() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void isFull() throws Exception {
    }

}