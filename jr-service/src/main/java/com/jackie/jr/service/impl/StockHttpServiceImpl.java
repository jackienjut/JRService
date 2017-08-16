package com.jackie.jr.service.impl;

import com.jackie.jr.dao.model.Stock;
import com.jackie.jr.service.StockHttpService;
import com.jackie.jr.utils.HttpUtils;
import com.jackie.jr.utils.UrlUtils;
import com.sun.jndi.toolkit.url.UrlUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.jackie.jr.utils.HttpUtils.*;

/**
 * Created by luhaiming on 2017/8/15 0015.
 */
@Service("stockHttpService")
public class StockHttpServiceImpl implements StockHttpService {


    @Override
    public List<Stock> httpStockDataById(int stockId) {
        String url = UrlUtils.getFullUrl();
        String res = HttpUtils.get(url);


        List<Stock> stocks = new ArrayList<>();
        String response = get(url);

        return null;
    }
}
