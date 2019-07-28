package app.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author faith.huan 2019-07-28 11:12
 */
public class StringWordCountTest {

    @Test
    public void test(){
        String str="yekmaakkccekmbvb";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        collect.forEach((key,value)->{
            System.out.println(key + ":" + value);
        });
    }
}
