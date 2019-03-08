package com.panjiao.shop.myPractices.thread;

/**
 * Created by xp
 * on 2019/3/3.
 */
public class JionMethod {
    //写主方法
    public static void main(String[] args){
        method1();
        method2();
    }
    //写第一个线程的方法
    private static void method1(){
        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 is starting");
            }
        });
        //写第二个线程的方法并在第二个线程中调用第一个方法的jion()方法
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 is starting");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override public void run() {
                try {
                    t2.join();
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3 is staring");
            }
        });

        t3.start();
        t1.start();
        t2.start();
    }

    private static void method2(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行完成");
            }
        };


        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        Thread t3 = new Thread(runnable,"t3");

        try {
            t1.start();
            t2.start();
            t2.join();
            t1.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
