package com.jackie.jr.service;

import com.jackie.jr.dao.model.StockData;
import com.jackie.jr.vo.StockDataVO;

import java.text.ParseException;
import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
public interface StockDataService {

    public StockDataVO listStockData(String stockId);

    public boolean deleteStockDataByStockId(String stockId);

    public boolean saveStockData(List<StockData> listDatas);

    public boolean saveStockDataByStockID(String stockId) ;
}
