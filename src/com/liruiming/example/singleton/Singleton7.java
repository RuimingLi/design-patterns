package com.liruiming.example.singleton;

/**
 * Description: Singleton7 单例模式  静态内部类   【推荐用】
 *         类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 *         优点：避免了线程不安全，延迟加载，效率高。
 * @author LiRuiMing
 * @date 2018/5/14
 */
public class Singleton7 {
    private Singleton7(){}
    private static class SingletonHolder {
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    public static final Singleton7 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
