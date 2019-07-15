package app.args;

import org.junit.Test;

/**
 * https://bbs.csdn.net/topics/392835751#post-404203996
 *
 * @author faith.huan 2019-07-15 22:30
 */
public class ParamExchangeTest {

    @Test
    public void test() {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';

        // 交换a d
        char tmp = a;
        a = d;
        d = tmp;
        // 交换 b c
        tmp = b;
        b = c;
        c = tmp;
        // 输出abcd
        System.out.println("a:" + a + ",b:" + b + ",c:" + c + ",d:" + d);
    }

}
