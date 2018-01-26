package com.jackie.jr.service;

import com.jackie.jr.dao.inter.IStock163Operation;
import com.jackie.jr.dao.model.Stock163;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by luhaiming on 2018/1/24 0024.
 */
public interface Stock163Service {

    public String  refreshStockByCode(String code);

    public Stock163 getLastDayData(String code);

    public void deleteStockByCode(String code);

    public List<Stock163> getStockByCode(String code);

    public List<String> getAllSavedCodeName();
}
