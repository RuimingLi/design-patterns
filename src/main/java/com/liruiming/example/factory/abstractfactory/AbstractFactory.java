package com.liruiming.example.factory.abstractfactory;

import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.Yogurt;

/**
 * Description: AbstractFactory 抽象工厂模式
 * 抽象工厂：
 *        现在增加酸奶Yogurt产品，需要对原来的工厂进行改造升级
 *
 * 要理解抽象工厂方法，要先理解产品族和产品等级结构这两个概念
 *    1.产品等级结构： 即产品的继承结构，如抽象类是纯牛奶，其子类有蒙牛纯牛奶、伊利纯牛奶、光明纯牛奶，
 *                   此时抽象类纯牛奶与其子类具体品牌的纯牛奶构成一个产品等级结构
 *    2.产品族：      指由同一个工厂生产的，位于不同产品等级结构的一组产品，
 *                   如蒙牛工厂生产的蒙牛纯牛奶、蒙牛纯甄酸奶构成了一个产品族
 *
 * 注意：当增加新的产品族时，抽象工厂很好的支持开闭原则，
 *          例如：增加一个新希望品牌的产品族，只需增加具体的产品新希望纯牛奶和新希望酸奶，并对应新增一个新的新希望牛奶工厂，对已有代码无需修改
 *      但是，当增加新的产品结构时，需要修改包括抽象工厂在内的所有工厂，不符合开闭原则,
 *          例如：增加一个新的产品结构儿童牛奶，需要同时修改所有的工厂，增加获取儿童牛奶的方法，不符合开闭原则
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
