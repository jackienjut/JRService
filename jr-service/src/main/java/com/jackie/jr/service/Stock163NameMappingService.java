package com.jackie.jr.service;

import com.jackie.jr.dao.model.StockCodeName;
import com.jackie.jr.vo.StockCodeNameVO;

import java.util.List;

/**
 * Created by luhaiming on 2018/1/16 0016.
 */
public interface Stock163NameMappingService {
    public boolean insertIntpStockMapping();
    public boolean deleteStockIdMapping();

    public boolean refreshMapping();

    public List<StockCodeName> getAllStocks();
}
