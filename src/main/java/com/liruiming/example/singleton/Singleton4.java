package com.liruiming.example.singleton;

/**
 * Description: Singleton4 单例模式  懒汉式  （线程安全，同步方法） [不推荐]
 *      解决了线程不安全的问题，但是效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步
 * @author LiRuiMing
 * @date 2018/5/14
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){}
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
