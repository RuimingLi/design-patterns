package com.liruiming.example.factory.simplefactory;

import com.liruiming.example.factory.Guangming;
import com.liruiming.example.factory.Mengniu;
import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.Yili;

/**
 * Description: SimpleFactory 简单工厂模式
 * 简单工厂模式:
 *      用户在使用时直接根据工厂类去创建所需的实例，不需要关心这些产品是如和创建、如何组织的
 *      但是每增加一种产品就要重写获取产品的方法,不修改代码无法扩展，不符合开闭原则
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class SimpleFactory {
    /**
     * 获取Milk产品的方法
     * @param name 根据传入的产品名称获取对应的产品
     * @return Milk
     */
    public static Milk getMilk(String name){
        if("蒙牛".equals(name)){
            return new Mengniu();
        }
        if("伊利".equals(name)){
            return new Yili();
        }
        if("光明".equals(name)){
            return new Guangming();
        }
        throw  new RuntimeException("没有你所需要的产品: "+ name);
    }
}
