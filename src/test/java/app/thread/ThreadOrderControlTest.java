package app.thread;

import java.util.concurrent.CountDownLatch;

/**
 * 通过CountDownLatch实现c线程晚于ab线程结束
 *
 * @author faith.huan 2019-08-11 20:23
 */
public class ThreadOrderControlTest {


    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程" + Thread.currentThread().getName() + "结束");
            countDownLatch.countDown();
        }, "a").start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程" + Thread.currentThread().getName() + "结束");
            countDownLatch.countDown();
        }, "b").start();

        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程" + Thread.currentThread().getName() + "结束");
        }, "c").start();
    }
}
