package com.liruiming.example.factory.simplefactory;

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
        System.out.println(SimpleFactory.getMilk("蒙牛").getName());
        System.out.println(SimpleFactory.getMilk("伊利").getName());
        System.out.println(SimpleFactory.getMilk("光明").getName());
    }
}
