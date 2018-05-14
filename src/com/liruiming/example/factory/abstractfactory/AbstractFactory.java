package com.liruiming.example.factory.abstractfactory;

import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.Yogurt;

/**
 * Description: AbstractFactory 抽象工厂模式
 * 抽象工厂：
 *        现在增加酸奶Yogurt产品，需要对原来的工厂进行改造升级
 *
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public abstract class AbstractFactory {
    /**
     * 获取牛奶的方法
     */
    public abstract Milk getMilk();

    /**
     * 获取酸奶的方法
     */
    public abstract Yogurt getYogurt();

}
