package com.jackie.jr.web.controller;

import com.jackie.jr.dao.model.StockCodeName;
import com.jackie.jr.service.Stock163NameMappingService;
import com.jackie.jr.service.Stock163Service;
import com.jackie.jr.service.StockDataService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luhaiming on 2018/1/16 0016.
 */

@Controller
@RequestMapping("/stock163")
public class Stock163Controller extends BaseController {


    @Resource
    private Stock163NameMappingService stock163NameMappingService;

    @Resource
    private Stock163Service stock163Service;

  /*  @RequestMapping(method = RequestMethod.GET, value = "/refresh")
    @ResponseBody
    public String updateAllStockNameMapping() {
        stock163NameMappingService.refreshMapping();
        return "refresh success";
    }*/

    @RequestMapping(method = RequestMethod.GET, value = "/getallcodename", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateAllStockNameMapping() {
        List<StockCodeName> stockCodeNames = stock163NameMappingService.getAllStocks();
        return JSONArray.fromObject(stockCodeNames).toString();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/refresh/{stockid}", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String refreshData(@PathVariable(value = "stockid", required = true) String stockid) {
        stock163Service.refreshStockByCode(stockid);
        return "refresh data success";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/test/{test}")
    public
    @ResponseBody
    String test(@PathVariable String test) {
        return "hao好的" + test;
    }
}
