package com.jackie.jr.service.impl;

import com.jackie.jr.constant.Constant;
import com.jackie.jr.dao.inter.IStock163Operation;
import com.jackie.jr.dao.model.Stock163;
import com.jackie.jr.service.Stock163Service;
import com.jackie.jr.utils.HttpUtils;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luhaiming on 2018/1/24 0024.
 */
@Service("stock163Service")
public class Stock163ServiceImpl implements Stock163Service {

    @Resource
    private IStock163Operation stock163Operation;

    @Override
    public void
    refreshStockByCode(String code) {

        String url = getStockUrl(code);
        String responseStr = HttpUtils.get(url);
        List<Stock163> stocks = new ArrayList<>();
        try {

            String[] responseStrs = responseStr.split("\\r\\n");


            for (int i = 1; i < responseStrs.length; i++) {
                String resStr = responseStrs[i];

                String[] stockDs = resStr.split(",");

                Stock163 stock = new Stock163();
                java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");

                Date date = (Date) formatter.parse(stockDs[0]);

                stock.setDate(date);
                stock.setCode(stockDs[1]);
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
                stock.setNumberoftransactionpens(stockDs[14]);

                stocks.add(stock);
            }

            stock163Operation.addStocks(stocks);

        } catch (Exception e) {

        }

    }

    @Override
    public void deleteStockByCode(String code) {

    }

    @Override
    public void getStockByCode(String code) {

    }

    private String getStockUrl(String code) {
        return Constant.URL_GET_STOCK_CODE_163 + code;
    }
}
