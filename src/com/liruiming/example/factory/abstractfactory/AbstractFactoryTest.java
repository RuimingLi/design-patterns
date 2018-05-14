package com.liruiming.example.factory.abstractfactory;

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
        AbstractFactory factory1 = new GuangmingFactory();
        System.out.println(factory1.getMilk().getName());
        System.out.println(factory1.getYogurt().getName());

        AbstractFactory factory2 = new MengniuFactory();
        System.out.println(factory2.getMilk().getName());
        System.out.println(factory2.getYogurt().getName());

        AbstractFactory factory3 = new YiliFactory();
        System.out.println(factory3.getMilk().getName());
        System.out.println(factory3.getYogurt().getName());
    }
}
