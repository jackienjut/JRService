package com.jackie.jr.service;

import com.jackie.jr.dao.model.Stock;
import com.jackie.jr.dto.stock.StockQueryDTO;
import com.jackie.jr.vo.StockDataVO;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/19 0019.
 */
public interface StockDataService {

  public List<StockDataVO> listStockData(StockQueryDTO stockQueryDTO);

  public boolean saveStockData(List<StockDataDTO> listDatas);



}
