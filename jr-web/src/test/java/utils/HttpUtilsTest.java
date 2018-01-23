package utils;

import com.jackie.jr.utils.HttpUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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

    @Test
    public void testPost3() {
        String url = "http://quotes.money.163.com/hs/service/marketradar_ajax.php?page=0&query=STYPE%3AEQA&types=JHJJFL&count=10000&type=query";
        String res = HttpUtils.get(url);
        JSONObject resObject = JSONObject.fromObject(res);
        JSONArray list =  JSONArray.fromObject(resObject.get("list"));
        System.out.println(list.size());
    }

    public static String conver(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            int strInt = str.charAt(i);
            if (strInt > 127) {
                temp += "\\u" + Integer.toHexString(strInt);
            } else {
                temp = String.valueOf(str.charAt(i));
            }
            result += temp;
        }
        return result;
    }

    @Test
    public void testPost4() {
        String url = "http://localhost:8088/stock163/test";
        String res = HttpUtils.get(url);
        System.out.println(res);
    }
}
