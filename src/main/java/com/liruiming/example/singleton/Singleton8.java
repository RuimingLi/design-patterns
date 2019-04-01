package com.liruiming.example.singleton;

/**
 * Description: Singleton8 单例模式  枚举   【推荐用】
 *         不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * @author LiRuiMing
 * @date 2018/5/14
 */
public enum Singleton8 {
    INSTANCE;
    public void method(){}
}
