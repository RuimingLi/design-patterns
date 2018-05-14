package com.liruiming.example.factory.factorymethod;

import com.liruiming.example.factory.Guangming;
import com.liruiming.example.factory.Milk;

/**
 * Description: GuangmingFactory 获取光明牛奶的工厂
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class GuangmingFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Guangming();
    }
}
