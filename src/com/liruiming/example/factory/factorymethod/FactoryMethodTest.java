package com.liruiming.example.factory.factorymethod;

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
        Factory factory1 = new MengniuFactory();
        System.out.println(factory1.getMilk().getName());
        Factory factory2 = new YiliFactory();
        System.out.println(factory2.getMilk().getName());
        Factory factory3 = new GuangmingFactory();
        System.out.println(factory3.getMilk().getName());
    }
}
