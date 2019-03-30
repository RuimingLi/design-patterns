package com.liruiming.example.factory.simplefactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Description: SimpleFactoryTest 简单工厂的测试类
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class SimpleFactoryTest {

    @Test
    public void test(){
        Assert.assertEquals("蒙牛纯牛奶",SimpleFactory.getMilk("蒙牛").getName());
        Assert.assertEquals("伊利纯牛奶",SimpleFactory.getMilk("伊利").getName());
        Assert.assertEquals("光明纯牛奶",SimpleFactory.getMilk("光明").getName());
    }
}
