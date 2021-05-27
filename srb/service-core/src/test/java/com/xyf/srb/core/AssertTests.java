package com.xyf.srb.core;
/*
@author XYF
@date 2021/5/7- 20:50     
*/


import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class AssertTests {

    //if else的用法
    @Test
    public void test1() {
        Object o = null;
        if (o == null) {
            throw new IllegalArgumentException("参数错误.");
        }
    }

    //断言的用法：更为简洁
    @Test
    public void test2() {
        // 另一种写法
        Object o = null;
        Assert.notNull(o,"参数错误");
    }

}
