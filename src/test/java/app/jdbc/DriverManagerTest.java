package app.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * @author faith.huan 2019-07-16 22:35
 */
public class DriverManagerTest {

    @Test
    public void get(){
        Enumeration<Driver> drivers = DriverManager.getDrivers();

        while (drivers.hasMoreElements()){
            System.out.println(drivers.nextElement());
        }
    }
    
    
    @Test
    public void getConnection(){
        //第二步：注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第三步：创建sql语句
        String sql = "select id,username,age,sex,phone from  sys_user";

        String url ="jdbc:mysql://localhost:3306/mysql";

        Enumeration<Driver> drivers = DriverManager.getDrivers();

        while (drivers.hasMoreElements()){
            System.out.println(drivers.nextElement());
        }
        //第四步：创建连接
        try {
            Connection conn = DriverManager.getConnection(url, "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
