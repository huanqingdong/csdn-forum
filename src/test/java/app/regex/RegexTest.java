package app.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author faith.huan 2019-10-07 15:32
 */
public class RegexTest {

    @Test
    public void extract(){

//        Pattern pattern =  Pattern.compile("(\\[\\[address\\]\\][\\s\\S]*)*");
//        Pattern pattern =  Pattern.compile("\\[\\[([^\\[\\]]+)]]");
        Pattern pattern =  Pattern.compile("\\[\\[([^\\[\\]]+)]]");
        String text = "[[company_name]].\n" +
                "[[first_name]] [[last_name]]\n" +
                "[[address]], x[[city]],\n" +
                "[[county]], [[state]], [[zip]]\n" +
                "([[email]])\n" +
                "Welcome, [[first_name]] [[last_name]], to our party. ";

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
//            System.out.println(matcher.groupCount());
//           for(int i =0 ;i<=matcher.groupCount();i++){
//               System.out.println(matcher.group(1));
//            }
            int count = matcher.groupCount();
            for (int i = 1; i <= count; i++) {
                System.out.println(matcher.group(1));
            }
        }
        //Matcher

    }


    @Test
    public void extract1(){

        Pattern pattern = Pattern.compile("\\[\\[([^\\[\\]]+)]]");

        String s1 = "[[company_name]].\n" +
                "[[first_name]] [[last_name]]\n" +
                "[[address]], x[[city]],\n" +
                "[[county]], [[state]], [[zip]]\n" +
                "([[email]])\n" +
                "Welcome, [[first_name]] [[last_name]], to our party. ";
        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()) {
            int count = matcher.groupCount();
            for (int i = 1; i <= count; i++) {
                System.out.println(matcher.group(1));
            }
        }

    }

}
