package com.liruiming.example.factory.factorymethod;

import org.junit.Assert;
import org.junit.Test;

/**
 * Description: FactoryMethodTest 工厂方法模式测试类
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class FactoryMethodTest {

    @Test
    public void test(){
        Factory mengniuFactory = new MengniuFactory();
        Assert.assertEquals("蒙牛纯牛奶", mengniuFactory.getMilk().getName());

        Factory yiliFactory = new YiliFactory();
        Assert.assertEquals("伊利纯牛奶",yiliFactory.getMilk().getName());

        Factory guangmingFactory = new GuangmingFactory();
        Assert.assertEquals("光明纯牛奶",guangmingFactory.getMilk().getName());
    }
}
