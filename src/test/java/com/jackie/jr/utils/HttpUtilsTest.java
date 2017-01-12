package com.jackie.jr.utils;

import org.junit.Test;

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
    public void testPost() {

    }
}
