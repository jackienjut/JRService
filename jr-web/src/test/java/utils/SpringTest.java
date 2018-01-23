package utils;

import com.jackie.jr.web.constant.Constant;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by luhaiming on 2018/1/8 0008.
 */
public class SpringTest {

    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Constant constant = (Constant) ctx.getBean("Constant");
        System.out.println(constant.getBASE_URL());
    }
}
