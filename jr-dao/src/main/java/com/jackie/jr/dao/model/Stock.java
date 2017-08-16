package com.jackie.jr.dao.model;

import java.util.Date;

/**
 * Created by luhaiming on 2017/2/4 0004.
 */
public class Stock {

    public int id;
    public int stockid;
    public Date date;
    public double open;
    public double high;
    public double low;
    public double close;
    public int volume;
    public double adjclose;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getAdjclose() {
        return adjclose;
    }

    public void setAdjclose(double adjclose) {
        this.adjclose = adjclose;
    }
}
