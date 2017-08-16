package com.jackie.jr.vo;

import com.jackie.jr.dao.model.Stock;

import java.util.Date;
import java.util.List;

/**
 * Created by luhaiming on 2017/8/14 0014.
 */
public class StockDataVO {
    private int stockid;
    List<Stock> stocks;

    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
