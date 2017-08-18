package com.jackie.jr.service.impl;

import com.jackie.jr.dao.model.StockData;
import com.jackie.jr.service.StockHttpService;
import com.jackie.jr.utils.HttpUtils;
import com.jackie.jr.utils.UrlUtils;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by luhaiming on 2017/8/15 0015.
 */
@Service("stockHttpService")
public class StockHttpServiceImpl implements StockHttpService {


    @Override
    public List<StockData> httpStockDataById(String stockId) throws ParseException {
        UrlUtils urlUtils = new UrlUtils();
        String url = urlUtils.getFullUrl(stockId);
        String res = HttpUtils.get(url);
        List<StockData> stocks = new ArrayList<>();
        String[] reses = res.split("\n");

        for (int i = 1; i < reses.length; i++) {
            String[] vales = reses[i].split(",");

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            String stockid = vales[1]; //股票代码
            if (stockid.indexOf("'")!= -1)
                stockid = stockId.replace("'" ,"");

            Date date = dateFormat.parse(vales[0]);
            String open = vales[6]; //开盘价
            String high = vales[4]; //最高价
            String low = vales[5]; //最低价
            String close = vales[3]; //收盘价
            String fclose = vales[7]; //前收盘
            String changeAmount = vales[8]; //涨跌额
            String priceChangeAmount = vales[9]; //涨跌幅
            String turnoverRate = vales[10]; //换手率
            String volume = vales[11]; //成交量
            String volumeAmount = vales[12]; //成交金额
            String totalMarketCapitalization = vales[13]; //总市值
            String circulationMarketValue = vales[14]; //流通市值
            String numberOfTransactions = vales[15]; //成交笔数

            StockData stockData = new StockData();

            // setting data value
            stockData.setStockId(stockid);
            stockData.setDate(date);
            stockData.setOpen(open);
            stockData.setHigh(high);
            stockData.setLow(low);
            stockData.setClose(close);
            stockData.setFclose(fclose);
            stockData.setChangeAmount(changeAmount);
            stockData.setPriceChangeAmount(priceChangeAmount);
            stockData.setTurnoverRate(turnoverRate);
            stockData.setVolume(volume);
            stockData.setVolumeAmount(volumeAmount);
            stockData.setTotalMarketCapitalization(totalMarketCapitalization);
            stockData.setCirculationMarketValue(circulationMarketValue);
            stockData.setNumberOfTransactions(numberOfTransactions);

            stocks.add(stockData);
        }

        return stocks;
    }
}
