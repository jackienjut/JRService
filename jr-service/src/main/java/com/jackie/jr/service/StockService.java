package com.jackie.jr.service;

import com.jackie.jr.dao.model.StockInfo;

import java.util.List;

/**
 * Created by luhaiming on 2017/11/10 0010.
 */
public interface StockService {
    void println(String test);

    void initializeStocks(List<StockInfo> stockInfos);
}
