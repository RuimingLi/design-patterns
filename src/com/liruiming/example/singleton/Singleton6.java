package com.liruiming.example.singleton;

/**
 * Description: Singleton6 单例模式  双重校验锁   【推荐用】
 *          进行了两次if (singleton == null)检查，这样就可以保证线程安全了。实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 *          优点：线程安全；延迟加载；效率较高
 * @author LiRuiMing
 * @date 2018/5/14
 */
public class Singleton6 {
    private static volatile Singleton6 instance;
    private Singleton6(){}

    public static Singleton6 getInstance() {
        if(instance == null){
            synchronized (Singleton6.class){
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
