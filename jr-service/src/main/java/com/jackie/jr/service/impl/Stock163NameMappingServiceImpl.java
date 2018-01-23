package com.jackie.jr.service.impl;

import com.jackie.jr.constant.Constant;
import com.jackie.jr.dao.inter.IStockIdMappingOperation;
import com.jackie.jr.dao.model.StockCodeName;
import com.jackie.jr.service.Stock163NameMappingService;
import com.jackie.jr.utils.HttpUtils;
import com.jackie.jr.vo.StockCodeNameVO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luhaiming on 2018/1/17 0017.
 */
@Service("Stock163NameMappingService")
public class Stock163NameMappingServiceImpl implements Stock163NameMappingService {
    @Resource
    private IStockIdMappingOperation stockIdMappingOperation;

    @Override
    public boolean insertIntpStockMapping() {
        return false;
    }

    @Override
    public boolean deleteStockIdMapping() {
        return false;
    }

    @Override
    public boolean refreshMapping() {
        stockIdMappingOperation.deleteAll();

        String resposeStr = HttpUtils.get(Constant.url_all_stock_name_163);

        JSONObject resObject = JSONObject.fromObject(resposeStr);
        JSONArray list = JSONArray.fromObject(resObject.get("list"));
        List<StockCodeName> stockMappings = new ArrayList<>();
        for (Object o : list) {
            JSONObject jsonObject = (JSONObject) o;
            StockCodeName stockMapping = new StockCodeName();
            stockMapping.setCode(jsonObject.get("CODE").toString());
            stockMapping.setSymbol(jsonObject.get("SYMBOL").toString());
            stockMapping.setName(jsonObject.get("NAME").toString());
            stockMappings.add(stockMapping);
        }

        stockIdMappingOperation.insertIntoStockMapping(stockMappings);
        return true;
    }

    @Override
    public List<StockCodeName> getAllStocks() {
        List<StockCodeName> stockCodeNames = stockIdMappingOperation.selectAll();
        return stockCodeNames;
    }
}
