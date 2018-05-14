package com.liruiming.example.factory.factorymethod;

import com.liruiming.example.factory.Milk;

/**
 * Description: Factory 工厂方法模式
 * 工厂方法模式:
 *        是简单工厂的衍生，是对简单工厂的一种抽象，实现了可扩展，符合开闭原则
 *        定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂方法使一个类的实例化延迟到其子类
 *        用户必须找到对应的工厂才能创建相应的产品
 *        主要适用于单一产品的结构;当产品结构复杂时，每增加一种产品就要增加该产品的工厂实现类，导致工厂泛滥，对用户不友好
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public interface Factory {
    /**
     * 获取Milk产品的方法
     * @return Milk
     */
    Milk getMilk();
}
