package com.jackie.jr.service;

import com.jackie.jr.dao.inter.IStock163Operation;

import javax.annotation.Resource;

/**
 * Created by luhaiming on 2018/1/24 0024.
 */
public interface Stock163Service {

    public void refreshStockByCode(String code);

    public void deleteStockByCode(String code);

    public void getStockByCode(String code);
}
