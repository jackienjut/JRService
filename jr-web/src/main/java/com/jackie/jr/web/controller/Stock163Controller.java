package com.jackie.jr.web.controller;

import com.jackie.jr.dao.model.StockCodeName;
import com.jackie.jr.service.Stock163NameMappingService;
import com.jackie.jr.service.StockDataService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by luhaiming on 2018/1/16 0016.
 */

@Controller
@RequestMapping("/stock163")
public class Stock163Controller extends BaseController {


    @Resource
    private StockDataService stockDataService;


    @Resource
    private Stock163NameMappingService stock163NameMappingService;

  /*  @RequestMapping(method = RequestMethod.GET, value = "/refresh")
    @ResponseBody
    public String updateAllStockNameMapping() {
        stock163NameMappingService.refreshMapping();
        return "refresh success";
    }*/

    @RequestMapping(method = RequestMethod.GET, value = "/getallcodename" ,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateAllStockNameMapping() {
       List<StockCodeName> stockCodeNames = stock163NameMappingService.getAllStocks();
        return  JSONArray.fromObject(stockCodeNames).toString();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public @ResponseBody String test() {

        return  "hao好的";
    }
}
