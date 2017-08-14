package com.jackie.jr.service.impl;

import com.jackie.jr.dao.inter.IStockOperation;
import com.jackie.jr.dao.model.Stock;
import com.jackie.jr.dto.stock.StockQueryDTO;
import com.jackie.jr.service.StockDataService;
import com.jackie.jr.vo.StockDataVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
@Service("stockDataService")
public class StockDataServiceImpl implements StockDataService {


    @Resource
    private IStockOperation stockOperation;

    @Override
    public List<StockDataVO> listStockData(StockQueryDTO stockQueryDTO) {

        List<Stock> listStocks = stockOperation.selectStocks(stockQueryDTO.getId());
        return null;
    }
}
