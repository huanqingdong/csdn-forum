package app.reflect;

import java.lang.reflect.Constructor;

/**
 * https://bbs.csdn.net/topics/393022129
 *
 * @author faith.huan 2019-08-04 10:03
 */
public class ReflectPrivateConstructorTest {


    public static void main(String[] args) {
        Class c = MyGod.class;


        try {
            // getConstructor只能获取public的构造方法
            // Constructor constructor = c.getConstructor(int.class, String.class, Float.class);
            Constructor declaredConstructor = c.getDeclaredConstructor(int.class, String.class, Float.class);
            declaredConstructor.setAccessible(true);
            Object obj = declaredConstructor.newInstance(10, "心态不好", 5.26f);

            System.out.println(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    static class MyGod {

        int password;
        String str;
        Float id;

        private MyGod(int password, String str, Float id) {

            this.password = password;
            this.id = id;
            this.str = str;

        }


        @Override
        public String toString() {
            return "MyGod{" +
                    "password=" + password +
                    ", str='" + str + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
