package com.liruiming.example.singleton;

/**
 * Description: Singleton3 单例模式  懒汉式 （线程不安全）[不可用]
 *          这种写法起到了Lazy Loading的效果，但是只能在单线程下使用
 * @author LiRuiMing
 * @date 2018/5/14
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
