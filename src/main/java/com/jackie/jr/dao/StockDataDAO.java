package com.jackie.jr.dao;

import com.jackie.jr.model.Stock;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
public interface StockDataDAO {
    public List<Stock> getData(String stockID);

    public boolean addData(String stockID);

}
