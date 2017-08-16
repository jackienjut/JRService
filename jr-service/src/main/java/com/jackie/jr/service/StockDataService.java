package com.jackie.jr.service;

import com.jackie.jr.dao.model.Stock;
import com.jackie.jr.dto.stock.StockDataDTO;
import com.jackie.jr.dto.stock.StockQueryDTO;
import com.jackie.jr.vo.StockDataVO;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
public interface StockDataService {

    public StockDataVO listStockData(int stockId);

    public boolean deleteStockDataByStockId(int stockId);

    public boolean saveStockData(List<StockDataDTO> listDatas);

    public boolean saveStockDataByStockID(int stockId);
}
