package com.jackie.jr.dao.model;

import java.util.Date;

/**
 * Created by luhaiming on 2017/2/4 0004.
 */
public class StockData {

    public int id;  //日期
    public String stockid; //股票代码
    public Date date;
    public String open; //开盘价
    public String high; //最高价
    public String low; //最低价
    public String close; //收盘价
    public String fclose; //前收盘
    public String changeAmount; //涨跌额
    public String priceChangeAmount; //涨跌幅
    public String turnoverRate; //换手率
    public String volume; //成交量
    public String volumeAmount; //成交金额
    public String totalMarketCapitalization; //总市值
    public String circulationMarketValue; //流通市值
    public String numberOfTransactions; //成交笔数


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getFclose() {
        return fclose;
    }

    public void setFclose(String fclose) {
        this.fclose = fclose;
    }

    public String getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    public String getPriceChangeAmount() {
        return priceChangeAmount;
    }

    public void setPriceChangeAmount(String priceChangeAmount) {
        this.priceChangeAmount = priceChangeAmount;
    }

    public String getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(String turnoverRate) {
        this.turnoverRate = turnoverRate;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolumeAmount() {
        return volumeAmount;
    }

    public void setVolumeAmount(String volumeAmount) {
        this.volumeAmount = volumeAmount;
    }

    public String getTotalMarketCapitalization() {
        return totalMarketCapitalization;
    }

    public void setTotalMarketCapitalization(String totalMarketCapitalization) {
        this.totalMarketCapitalization = totalMarketCapitalization;
    }

    public String getCirculationMarketValue() {
        return circulationMarketValue;
    }

    public void setCirculationMarketValue(String circulationMarketValue) {
        this.circulationMarketValue = circulationMarketValue;
    }

    public String getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }
}
