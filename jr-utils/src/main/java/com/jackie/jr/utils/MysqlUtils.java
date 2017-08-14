package com.jackie.jr.utils;

import java.sql.*;

/**
 * Created by luhaiming on 2017/1/12 0012.
 */
public class MysqlUtils {

    public static void main(String[] args) {

        // 驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        // URL指向要访问的数据库名scutcs
        String url = "jdbc:mysql://116.62.50.226:3306/nous?useUnicode=true&characterEncoding=utf-8";
        // MySQL配置时的用户名
        String user = "nous";
        // MySQL配置时的密码
        String password = "gotmoney";
        try {
            // 加载驱动程序
            Class.forName(driver);
            // 连续数据库
            Connection conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            // statement用来执行SQL语句
            Statement statement = conn.createStatement();
            // 要执行的SQL语句
            String sql = "select * from test";
            // 结果集
            ResultSet rs = statement.executeQuery(sql);

            String name = null;
            while (rs.next()) {
                // 选择sname这列数据
                name = rs.getString("id");
                System.out.println(name);
            }
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
