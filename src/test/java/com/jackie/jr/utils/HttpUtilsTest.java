package com.jackie.jr.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

/**
 * Created by luhaiming on 2017/1/12 0012.
 */
public class HttpUtilsTest {

    @Test
    public void testGet() {

        String url = "http://table.finance.yahoo.com/table.csv?s=000001.sz";
        String res = HttpUtils.get(url);

        System.out.println(res);

    }

    @Test
    public void testGet1() {

        String url = "http://table.finance.yahoo.com/table.csv?s=AAPl";
        String res = HttpUtils.get(url);

        System.out.println(res);

    }

    @Test
    public void testPost() {

    }
}
