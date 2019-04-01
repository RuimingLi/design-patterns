package com.liruiming.example.factory.factorymethod;

import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.YiliMilk;

/**
 * Description: YiliFactory 获取伊利牛奶的工厂
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new YiliMilk();
    }
}
