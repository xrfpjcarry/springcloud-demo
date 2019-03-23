package com.panjiao.shop.myPractices.thread.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisStringCommands;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.types.Expiration;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xp
 * on 2019/3/14.
 */
public class RidesLockImpl implements Lock {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private String resouceName;

    private int timeOut;

    Lock lock =new ReentrantLock();

    public RidesLockImpl(String resouceName,int timeOut) {
        this.resouceName ="lock_" + resouceName;
        this.timeOut = timeOut;
    }
    @Override
    public void lock() {
        lock.lock();
        try {
            while (!tryLock()){
                stringRedisTemplate.execute(new RedisCallback<Long>() {
                    @Override
                    public Long doInRedis(RedisConnection connection) throws DataAccessException {
                        try {
                            CountDownLatch waiter = new CountDownLatch(1);
                            connection.subscribe((message,pattern) ->{
                                waiter.countDown();
                            },("release_lock" + resouceName).getBytes());

                            waiter.await(timeOut,TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return 0L;
                    }
                });

            }
        }finally {
            lock.unlock();
        }


    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
       Boolean lockRceout= stringRedisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                String value = "~";
               Boolean resout =  connection.set(resouceName.getBytes(),value.getBytes(),
                        Expiration.seconds(timeOut), RedisStringCommands.SetOption.SET_IF_ABSENT);
                return resout;
            }
        });
        return lockRceout;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        stringRedisTemplate.delete(resouceName);
        Long execute = stringRedisTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                Long publish = connection.publish(("release_lock" + resouceName).getBytes(), "".getBytes());
                return publish;
            }
        });
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
