package com.panjiao.shop.myPractices.thread.lock;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xp
 * on 2019/3/4.
 */
public class ReaderAndWriter<K,V> {
    //定义一个map用来做缓存
    private final Map<K, V> map;
    //定义一把锁
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //读的锁对象
    private final Lock readLock=readWriteLock.readLock();
    //写的锁对象
    private final Lock writeLock=readWriteLock.writeLock();
    //缓存的put方法
    public  void put(K key,V vule){
        writeLock.lock();
        try {
            map.put(key,vule);
        }finally {
            writeLock.unlock();
        }
    }
    //缓存的get方法


    public V get(K key){
        readLock.lock();
        try {
            V v = map.get(key);
            return v;
        }finally {
            readLock.unlock();
        }
    }


    public ReaderAndWriter(Map<K, V> map) {
        this.map = map;
    }


}
