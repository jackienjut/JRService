package com.jackie.jr.service;

import com.jackie.jr.dto.stock.StockDataDTO;
import com.jackie.jr.vo.StockDataVO;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
public interface StockDataService {

    public StockDataVO listStockData(String stockId);

    public boolean deleteStockDataByStockId(String stockId);

    public boolean saveStockData(List<StockDataDTO> listDatas);

    public boolean saveStockDataByStockID(String stockId);
}
