package com.jackie.jr.service;

import com.jackie.jr.dao.model.Stock;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
public interface StockDataService {

    public boolean updateData(String stockID);

    public boolean deleteData(String stockID);

    public boolean addData(String stockID);

    public List<Stock> getData(String stockID);

    public boolean isExist(String stockID);

    public List<Stock> getAllData();
}
