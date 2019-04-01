package com.liruiming.example.factory.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Description: AbstractFactoryTest 抽象工厂测试类
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class AbstractFactoryTest {
    @Test
    public void test(){
        AbstractFactory guangmingFactory = new GuangmingFactory();
        Assert.assertEquals("光明纯牛奶", guangmingFactory.getMilk().getName());
        Assert.assertEquals("光明莫斯利安酸奶", guangmingFactory.getYogurt().getName());

        AbstractFactory mengniuFactory = new MengniuFactory();
        Assert.assertEquals("蒙牛纯牛奶", mengniuFactory.getMilk().getName());
        Assert.assertEquals("蒙牛纯甄酸奶", mengniuFactory.getYogurt().getName());

        AbstractFactory yiliFactory = new YiliFactory();
        Assert.assertEquals("伊利纯牛奶", yiliFactory.getMilk().getName());
        Assert.assertEquals("伊利安慕希酸奶", yiliFactory.getYogurt().getName());
    }
}
