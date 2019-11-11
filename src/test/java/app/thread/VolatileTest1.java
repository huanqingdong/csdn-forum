package app.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 验证volatile效果
 * <p>
 * isShutDown 当用volatile修饰时,程序能结束
 * 不用volatile修饰时,程序不能结束
 */
public class VolatileTest1 {

    public static void main(String[] args) {
        Work work = new Work();
        new Thread(work::doWork).start();
        sleepMillis(200);

        new Thread(work::shutdown).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(work.i + "--" + Work.isShutDown);
            sleepMillis(100);
        }
    }

    private static void sleepMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

@Slf4j
class Work {

    public static volatile boolean isShutDown = false;

    public static int i = 0;

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    void shutdown() {
        isShutDown = true;
    }

    void doWork() {
        while (!isShutDown) {
            if (i > 10000000) {
                i--;
            } else {
                i++;
            }
        }
    }


}
