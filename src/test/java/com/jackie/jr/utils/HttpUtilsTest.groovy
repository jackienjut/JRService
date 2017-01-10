package com.jackie.jr.utils

import org.junit.Test

/**
 * Created by luhaiming on 2017/1/9 0009.
 */
class HttpUtilsTest {

    @Test
    void testGet() {

        String url = "http://table.finance.yahoo.com/table.csv?s=000001.sz";
        String res = HttpUtils.get(url);

        System.out.println(res);

    }

    @Test
    void testPost() {

    }
}
