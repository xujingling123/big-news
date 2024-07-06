package com.xu;

import org.junit.jupiter.api.Test;

public class ThreadLocalSetAndGet {

    @Test
    public void testThreadLocalSetAndGet(){
        //提供一个ThreadLocal对象
        ThreadLocal tl=new ThreadLocal();

        //开启两个线程
        new Thread(()->{
            tl.set("cookie");
            System.out.println(Thread.currentThread().getName()+":"+tl.get());
            System.out.println(Thread.currentThread().getName()+":"+tl.get());
            System.out.println(Thread.currentThread().getName()+":"+tl.get());

        },"pig").start();

        new Thread(()->{
            tl.set("offer");
            System.out.println(Thread.currentThread().getName()+":"+tl.get());
            System.out.println(Thread.currentThread().getName()+":"+tl.get());
            System.out.println(Thread.currentThread().getName()+":"+tl.get());

        },"lucky").start();
    }
}
