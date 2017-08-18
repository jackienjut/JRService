package com.jackie.jr.service;

import com.jackie.jr.dao.model.StockData;

import java.text.ParseException;
import java.util.List;

/**
 * Created by luhaiming on 2017/8/15 0015.
 */
public interface StockHttpService {
    List<StockData> httpStockDataById(String stockId) throws ParseException;
}
