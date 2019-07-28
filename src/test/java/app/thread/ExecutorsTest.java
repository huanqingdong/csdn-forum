package app.thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author faith.huan 2019-07-26 21:51
 */
@Slf4j
public class ExecutorsTest {


    @Test
    public void fixThreadPool() {
        ExecutorService es = Executors.newFixedThreadPool(10);
    }


    @Test
    public void scheduledThreadPool() {
        ScheduledExecutorService es = Executors.newSingleThreadScheduledExecutor();
        es.schedule(new Runnable() {
            @Override
            public void run() {
                es.schedule(this,1,TimeUnit.SECONDS);
                log.info("now" + new Date());
            }
        }, 1, TimeUnit.SECONDS);

       /* es.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                log.info("now" + new Date());
                System.out.println(Thread.currentThread().isDaemon());
            }
        }, 1,1, TimeUnit.SECONDS)
        ;*/

        try {
            es.awaitTermination(1000,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
