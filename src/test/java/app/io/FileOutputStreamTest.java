package app.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * https://bbs.csdn.net/topics/392835958
 *
 * @author faith.huan 2019-07-15 22:23
 */
public class FileOutputStreamTest {

    @Test
    public void write() throws IOException {
        // 创建文件输出流，第一个参数文件路径，第二个参数是否为append模式
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt",true);
        fileOutputStream.write("你好".getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

}
