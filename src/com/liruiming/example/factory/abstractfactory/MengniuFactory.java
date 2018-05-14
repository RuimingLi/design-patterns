package com.liruiming.example.factory.abstractfactory;


import com.liruiming.example.factory.Chunzhen;
import com.liruiming.example.factory.Mengniu;
import com.liruiming.example.factory.Milk;
import com.liruiming.example.factory.Yogurt;

/**
 * Description: MengniuFactory 获取蒙牛产品的工厂
 *
 * @author LiRuiMing
 * @date 2018/5/12
 */
public class MengniuFactory extends AbstractFactory{

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }

    @Override
    public Yogurt getYogurt() {
        return new Chunzhen();
    }
}
