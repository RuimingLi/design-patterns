package com.liruiming.example.factory.factorymethod;

import com.liruiming.example.factory.Mengniu;
import com.liruiming.example.factory.Milk;

/**
 * Description: MengniuFactory 获取蒙牛牛奶的工厂
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class MengniuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
