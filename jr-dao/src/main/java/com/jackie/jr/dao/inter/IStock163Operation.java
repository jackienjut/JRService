package com.jackie.jr.dao.inter;

import com.jackie.jr.dao.model.Stock163;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luhaiming on 2018/1/24 0024.
 */
@Repository("stock163Operation")
public interface IStock163Operation {
    public List<Stock163> getStockByCode(String code);
    public void deleteStockByCode(String code);
    public Stock163 getLastDayData(String code);
    public void addStocks(List<Stock163> stocks);

    public List<String> getAllSavedCodeName();
}
