package cn.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("/test")
public class TestContrller {

    @GetMapping("/test0")
    public void test0() {
        ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        System.out.println(pool.getActiveCount());
        System.out.println(pool.getCorePoolSize());
        System.out.println(pool.getMaximumPoolSize());
        System.out.println(pool.getPoolSize());
        System.out.println(pool.getTaskCount());
        System.out.println(pool.getLargestPoolSize());
        pool.execute(new jisuan());
        pool.submit(new jisuan());
        pool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        pool.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(Thread.currentThread().getName());
        pool.shutdown();
        System.out.println(Thread.currentThread().getName());
    }
    
    private class jisuan implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}