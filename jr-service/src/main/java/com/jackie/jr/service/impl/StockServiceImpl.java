package com.jackie.jr.service.impl;

import com.jackie.jr.dao.model.StockInfo;
import com.jackie.jr.service.StockService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luhaiming on 2017/11/10 0010.
 */
@Service("stockService")
public class StockServiceImpl implements StockService {


    @Override
    public void println(String test) {
        System.out.println(test);
    }

    @Override
    public void initializeStocks(List<StockInfo> stockInfos) {

    }
}
