package com.jackie.jr.vo;

import com.jackie.jr.dao.model.StockData;

import java.util.List;

/**
 * Created by luhaiming on 2017/8/14 0014.
 */
public class StockDataVO {
    private String stockid;
    List<StockData> stocks;

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    public List<StockData> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockData> stocks) {
        this.stocks = stocks;
    }
}
