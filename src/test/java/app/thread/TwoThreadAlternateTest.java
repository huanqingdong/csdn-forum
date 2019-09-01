package app.thread;

/**
 * 两个线程交替执行
 * https://bbs.csdn.net/topics/393121937?page=1#post-404532045
 *
 * @author faith.huan 2019-08-13 21:25
 */
public class TwoThreadAlternateTest {

    private static String nextThread = "a";

    public static void main(String[] args) {

        new Thread(() -> {
            int n = 1;
            while (n < 52) {
                if (nextThread.equals("a")) {
                    System.out.print(n++ + "" + n++);
                    nextThread = "b";
                }
            }

        }, "a").start();

        new Thread(() -> {
            int startChar = 65;
            int times = 0;
            while (times < 26) {
                if (nextThread.equals("b")) {
                    System.out.print((char) (startChar + times++) +" ");
                    nextThread = "a";
                }
            }

        }, "b").start();
    }

}
