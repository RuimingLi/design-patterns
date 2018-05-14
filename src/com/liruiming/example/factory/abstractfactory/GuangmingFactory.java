package com.liruiming.example.factory.abstractfactory;

import com.liruiming.example.factory.Guangming;
import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.Mosilian;
import com.liruiming.example.factory.Yogurt;

/**
 * Description: GuangmingFactory 获取光明产品的工厂
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class GuangmingFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new Guangming();
    }

    @Override
    public Yogurt getYogurt() {
        return new Mosilian();
    }
}
