package utils;


import com.jackie.jr.service.StockService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by luhaiming on 2017/11/10 0010.
 */

public class MySqlTest extends BaseTest {

    @Resource
    private StockService stockService;

    @Test
    public void initAllStockNames() {
        System.out.println("aaa");

        stockService.println("test");
    }
}
