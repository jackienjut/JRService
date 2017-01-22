package com.jackie.jr.utils;

import com.jackie.jr.inter.IUserOperation;
import com.jackie.jr.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;

import java.io.Reader;
import java.util.List;

/**
 * Created by luhaiming on 2017/1/12 0012.
 */
public class UserTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }

/*
      public static void main(String[] args) {
          SqlSession session = sqlSessionFactory.openSession();
          try {
              User user = (User) session.selectOne("selectUserByID", 1);
              System.out.println(user.getUserAddress());
              System.out.println(user.getUserName());
          } finally {
              session.close();
          }
      }*/

   /* public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        User user1 = (User) session.selectOne("selectUserByID", 1);

        System.out.println(user1.getUserAddress());
        System.out.println(user1.getUserName());

        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);
            User user = userOperation.selectUserByID(1);
            System.out.println(user.getUserAddress());
            System.out.println(user.getUserName());
        } finally {
            session.close();
        }
    }*/

    @Test
    public void test2() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);
            User user = userOperation.selectUserByID(1);
            System.out.println(user.getUserName());
        } finally {
            session.close();
        }
    }

    @Test
    public void test3() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);
            List<User> users = userOperation.selectUsers("%");

            for (User user : users) {
                System.out.println(user.getId() + ":" + user.getUserName() + ":" + user.getUserAddress());
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUserAddress("shanghai人民广场");
        user.setUserName("垃圾");
        user.setUserAge(19);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);
            userOperation.addUser(user);
            session.commit();
            ;

        } finally {
            session.close();
        }
    }

    @Test
    public void update() {


        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);

            User user = userOperation.selectUserByID(1);
            user.setUserName("fuck you");
            userOperation.updateUser(user);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void delete() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IUserOperation userOperation = session.getMapper(IUserOperation.class);
            userOperation.deleteUser(4);
            session.commit();

        } finally {
            session.close();
        }
    }

    @Test
    public void test1() {
        System.out.println("aaa");
    }
}
