package com.jackie.jr.service;

import com.jackie.jr.dao.model.Stock;

import java.util.List;

/**
 * Created by luhaiming on 2017/8/15 0015.
 */
public interface StockHttpService {
    List<Stock> httpStockDataById(int stockId);
}
