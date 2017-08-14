package com.jackie.jr.service.impl;

import com.jackie.jr.inter.IStockOperation;
import com.jackie.jr.model.Stock;
import com.jackie.jr.service.StockDataService;
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
    public boolean updateData(String stockID) {
        return false;
    }

    @Override
    public boolean deleteData(String stockID) {
        return false;
    }

    @Override
    public boolean addData(String stockID) {
        if (isExist(stockID)) {
            return false;
        } else {

        }
        return false;
    }

    @Override
    public List<Stock> getData(String stockID) {

        return null;
    }

    @Override
    public boolean isExist(String stockID) {

        return false;
    }

    @Override
    public List<Stock> getAllData() {
        return null;
    }
}
