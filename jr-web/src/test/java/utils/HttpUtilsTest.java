package utils;

import com.jackie.jr.utils.HttpUtils;
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
    public void testGet1() {
        String url = "http://table.finance.yahoo.com/table.csv?s=AAPl";
        String res = HttpUtils.get(url);
        System.out.println(res);
    }

    @Test
    public void testPost() {

        String url = "http://quotes.money.163.com/service/chddata.html?code=0000001&start=19901219&end=20150911&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;VOTURNOVER;VATURNOVER";
        String res = HttpUtils.get(url);
        System.out.println(res);
    }

    @Test
    public void testPost2() {

        String url = "http://quotes.money.163.com/service/chddata.html?code=0600671";
        String res = HttpUtils.get(url);
        System.out.println(res);
    }
}
