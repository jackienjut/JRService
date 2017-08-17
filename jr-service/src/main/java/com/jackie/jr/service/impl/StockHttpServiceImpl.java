package com.jackie.jr.service.impl;

import com.jackie.jr.dao.model.StockData;
import com.jackie.jr.service.StockHttpService;
import com.jackie.jr.utils.HttpUtils;
import com.jackie.jr.utils.UrlUtils;
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
    public List<StockData> httpStockDataById(String stockId) {
        UrlUtils urlUtils = new UrlUtils();
        String url = urlUtils.getFullUrl(stockId);

        String res = HttpUtils.get(url);


        List<StockData> stocks = new ArrayList<>();
        String response = get(url);

        return null;
    }
}
