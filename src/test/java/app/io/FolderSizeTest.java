package app.io;

import org.junit.Test;

import java.io.File;

/**
 * @author faith.huan 2019-09-01 9:57
 */
public class FolderSizeTest {

    @Test
    public void size(){

        File file = new File("D:\\data");

        System.out.println(file.length());



    }


}
