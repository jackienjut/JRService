package com.jackie.jr.service.impl;

import com.jackie.jr.constant.Constant;
import com.jackie.jr.dao.inter.IStock163Operation;
import com.jackie.jr.dao.model.Stock163;
import com.jackie.jr.service.Stock163Service;
import com.jackie.jr.utils.HttpUtils;
import net.sf.json.util.JSONUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by luhaiming on 2018/1/24 0024.
 */
@Service("stock163Service")
public class Stock163ServiceImpl implements Stock163Service {

    @Resource
    private IStock163Operation stock163Operation;

    @Override
    public String refreshStockByCode(String code) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Stock163 stock163 = getLastDayData(code);

        if (stock163 == null) {
            String url = getStockUrl(code);
            String responseStr = HttpUtils.get(url);
            List<Stock163> stocks = new ArrayList<>();
            try {
                String[] responseStrs = responseStr.split("\\r\\n");
                if (responseStrs.length == 1)
                    return "can not get stock data by code :" + code;
                for (int i = 1; i < responseStrs.length; i++) {
                    String resStr = responseStrs[i];
                    String[] stockDs = resStr.split(",");
                    Stock163 stock = new Stock163();
                    Date date = formatter.parse(stockDs[0]);
                    stock.setDate(date);
                    stock.setCode(code);
                    stock.setName(stockDs[2]);
                    stock.setTclose(stockDs[3]);
                    stock.setHigh(stockDs[4]);
                    stock.setLow(stockDs[5]);
                    stock.setTopen(stockDs[6]);
                    stock.setLclose(stockDs[7]);
                    stock.setChg(stockDs[8]);
                    stock.setPchg(stockDs[9]);
                    stock.setTurnoverrate(stockDs[10]);
                    stock.setVoturnover(stockDs[11]);
                    stock.setVaturnover(stockDs[12]);
                    stock.setTotalmarketvalue(stockDs[13]);
                    stock.setMarketvalueofcirculation(stockDs[14]);
                    stock.setNumberoftransactionpens(stockDs[15]);
                    stocks.add(stock);
                }
                stock163Operation.addStocks(stocks);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Date today = new Date();
            SimpleDateFormat formatter2 = new SimpleDateFormat("yyyyMMdd");

            String todayStr = formatter2.format(today);
            String stockDate = formatter2.format(DateUtils.addDays(stock163.getDate(), 1));

            String url = getStockDateUrlByCode(code, stockDate, todayStr);

            String responseStr = HttpUtils.get(url);
            List<Stock163> stocks = new ArrayList<>();
            try {
                String[] responseStrs = responseStr.split("\\r\\n");
                if (responseStrs.length == 1)
                    return "can not get stock data by code :" + code + "start date :" + formatter.format(DateUtils.addDays(stock163.getDate(), 1)) + " end date : " + formatter.format(today);
                for (int i = 1; i < responseStrs.length; i++) {
                    String resStr = responseStrs[i];
                    String[] stockDs = resStr.split(",");
                    Stock163 stock = new Stock163();
                    Date date = formatter.parse(stockDs[0]);
                    stock.setDate(date);
                    stock.setCode(code);
                    stock.setName(stockDs[2]);
                    stock.setTclose(stockDs[3]);
                    stock.setHigh(stockDs[4]);
                    stock.setLow(stockDs[5]);
                    stock.setTopen(stockDs[6]);
                    stock.setLclose(stockDs[7]);
                    stock.setChg(stockDs[8]);
                    stock.setPchg(stockDs[9]);
                    stock.setTurnoverrate(stockDs[10]);
                    stock.setVoturnover(stockDs[11]);
                    stock.setVaturnover(stockDs[12]);
                    stock.setTotalmarketvalue(stockDs[13]);
                    stock.setMarketvalueofcirculation(stockDs[14]);
                    stock.setNumberoftransactionpens(stockDs[15]);

                    stocks.add(stock);
                }
                stock163Operation.addStocks(stocks);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return "success";
    }

    @Override
    public Stock163 getLastDayData(String code) {
        Stock163 stock163 = stock163Operation.getLastDayData(code);
        return stock163;
    }

    @Override
    public void deleteStockByCode(String code) {

    }

    @Override
    public List<Stock163> getStockByCode(String code) {
        return stock163Operation.getStockByCode(code);
    }

    private String getStockUrl(String code) {
        return Constant.URL_GET_STOCK_CODE_163 + code;
    }

    private String getStockDateUrlByCode(String code, String startDate, String endDate) {
        return Constant.URL_GET_STOCK_CODE_163 + code + "&start=" + startDate + "&end=" + endDate;
    }

}
