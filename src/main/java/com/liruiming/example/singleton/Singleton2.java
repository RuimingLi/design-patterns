package com.liruiming.example.singleton;

/**
 * Description: Singleton2 单例模式 饿汉式（静态代码块）[可用]
 *         优缺点同饿汉式（静态常量）
 * @author LiRuiMing
 * @date 2018/5/14
 */
public class Singleton2 {
    private static Singleton2 instance;
    static {
        instance = new Singleton2();
    }
    private Singleton2(){}
    public Singleton2 getInstance(){
        return instance;
    }
}
