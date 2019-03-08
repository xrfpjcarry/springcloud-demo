package com.panjiao.shop.myPractices.singleObject;

/**
 * Created by xp
 * 单例的创建
 * on 2019/2/23.
 */
public class SingleDemo {
    //先私有化构造器
    private SingleDemo() {
    }
    //new一个静态的实例化对象
    private static SingleDemo singleDemo;
    //创建一个得到这个对象的公开化方法
    public static  SingleDemo getSingleDemo(){
        if (singleDemo==null){
            synchronized (SingleDemo.class){
                if (singleDemo==null){
                    return new SingleDemo();
                }
            }

        }
        return singleDemo;
    }
}
