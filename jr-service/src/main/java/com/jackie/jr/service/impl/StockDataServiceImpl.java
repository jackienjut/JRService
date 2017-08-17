package com.jackie.jr.service.impl;

import com.jackie.jr.dao.inter.IStockOperation;
import com.jackie.jr.dao.model.StockData;
import com.jackie.jr.dto.stock.StockDataDTO;
import com.jackie.jr.service.StockDataService;
import com.jackie.jr.service.StockHttpService;
import com.jackie.jr.vo.StockDataVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
@Service("stockDataService")
public class StockDataServiceImpl implements StockDataService {


    @Resource
    private IStockOperation stockOperation;

    @Resource
    private StockHttpService stockHttpService;

    @Override
    public StockDataVO listStockData(String stockId) {

        StockDataVO stockDataVO = new StockDataVO();
        List<StockData> listStocks = stockOperation.selectStocks(stockId);
        stockDataVO.setStockid(stockId);
        stockDataVO.setStocks(listStocks);
        return stockDataVO;
    }

    @Override
    public boolean deleteStockDataByStockId(String stockId) {
        stockOperation.deleteStockByStockId(stockId);
        return false;
    }

    @Override
    public boolean saveStockData(List<StockDataDTO> listDatas) {
        return false;
    }

    @Override
    public boolean saveStockDataByStockID(String stockId) {
        if (!(stockOperation.selectStockByID(stockId) == null) && !(stockOperation.selectStockByID(stockId).size() == 0)){
            stockOperation.deleteStockByStockId(stockId);
        }

        List<StockData> stocks = new ArrayList<>();

        stocks = stockHttpService.httpStockDataById(stockId);

        stockOperation.addStocksBatch(stocks);
        return false;
    }
}
