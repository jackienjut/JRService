package com.jackie.jr.dto.stock;

import java.util.Date;

/**
 * Created by luhaiming on 2017/8/14 0014.
 */
public class StockDataDTO {

    private int stockid;
    private Date date;
    private double open;
    private double high;
    private double low;
    private double close;
    private int volume;
    private double adjclose;

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
