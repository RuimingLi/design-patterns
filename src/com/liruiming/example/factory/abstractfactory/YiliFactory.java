package com.liruiming.example.factory.abstractfactory;

import com.liruiming.example.factory.Anmuxi;
import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.Yili;
import com.liruiming.example.factory.Yogurt;

/**
 * Description: YiliFactory 获取伊利产品的工厂
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class YiliFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }

    @Override
    public Yogurt getYogurt() {
        return new Anmuxi();
    }
}
