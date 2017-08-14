package com.jackie.jr.inter;

import com.jackie.jr.model.Stock;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/22 0022.
 */
public interface IStockOperation {


    public Stock selectStockByID(int id);

    public List<Stock> selectStocks(int stockid);

    public void addStock(Stock stock);

    public void updateStock(Stock stock);

    public void deleteStock(int stockid);

    public Stock dynamicIfTest(Stock stock);
}
