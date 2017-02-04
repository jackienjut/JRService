package com.jackie.jr.dao;

import com.jackie.jr.model.Stock;

import java.util.List;

/**
 * Created by luhaiming on 2017/2/4 0004.
 */
public interface StockDAO {
    public void insert(Stock stock);
    public Stock findByCustomerId(int id);

    public void insertBatch(List<Stock> stockList);
}
