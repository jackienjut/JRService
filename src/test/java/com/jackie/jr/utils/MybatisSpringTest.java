package com.jackie.jr.utils;

import com.jackie.jr.inter.IUserOperation;
import com.jackie.jr.model.Article;
import com.jackie.jr.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by luhaiming on 2017/1/24 0024.
 */
public class MybatisSpringTest {

    public static ApplicationContext ctx;

    static{
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSpring(){
        IUserOperation mapper = ((IUserOperation) ctx.getBean("userMapper"));

        System.out.println("得到用户id=1的用户信息");
        User user = mapper.selectUserByID(1);
        System.out.println(user.getUserAddress());

        //得到文章列表测试
        System.out.println("得到用户id为1的所有文章列表");
        List<Article> articles = mapper.getUserArticles(1);

        for(Article article:articles){
            System.out.println(article.getContent()+"--"+article.getTitle());
        }

    }
}
