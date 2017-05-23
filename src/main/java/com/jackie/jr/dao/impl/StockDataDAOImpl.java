package com.jackie.jr.dao.impl;

import com.jackie.jr.constant.Constant;
import com.jackie.jr.dao.StockDataDAO;
import com.jackie.jr.model.Stock;
import com.jackie.jr.utils.HttpUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
@Repository("stockDataDAO")
public class StockDataDAOImpl implements StockDataDAO {

    @Override
    public List<Stock> getData(String stockID) {
        return null;
    }

    @Override
    public boolean addData(String stockID) {
        String url = Constant.BASE_URL + "s=" + stockID + ".sz";
        String res = HttpUtils.get(url);
        return false;
    }
}
