package app.base;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author faith.huan 2019-08-11 20:09
 */
public class ListContainsTest {


    public static void main(String[] args) {
        Collection c = new ArrayList();
        Person p = new Person(12, "狗娃");
        c.add(p);
        Person p1 = new Person(12, "狗娃2");
        System.out.println("集合c中的id为" + c.contains(p));
        System.out.println("集合c中的id为" + c.contains(p1));
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.id == id;//判断id是否相等？
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }

}
