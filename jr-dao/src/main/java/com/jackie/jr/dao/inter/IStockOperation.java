package com.jackie.jr.dao.inter;

import com.jackie.jr.dao.model.StockData;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/22 0022.
 */
@Repository("stockOperation")
public interface IStockOperation {

    public List<StockData> selectStockByID(String stockId);


    public void addStock(StockData stock);

    public void addStocksBatch(List<StockData> stocks);

    public void updateStock(StockData stock);

    public void deleteStockByStockId(String stockid);

    public StockData dynamicIfTest(StockData stock);
}
