package com.jackie.jr.web.controller;

import com.jackie.jr.dao.inter.IStockOperation;
import com.jackie.jr.dto.stock.StockQueryDTO;
import com.jackie.jr.service.StockDataService;
import com.jackie.jr.utils.WebUtils;
import com.jackie.jr.vo.StockDataVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/8/14 0014.
 */

@Controller
@RequestMapping("/stockdata")
public class StockDataController {

    @Resource
    private StockDataService stockDataService;

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Map updateStock(StockQueryDTO stockQueryDTO, HttpServletResponse response) throws IOException {
        String message = "update stock success";
        Map result = new HashMap();

        return result;
    }


    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Map queryStock(StockQueryDTO stockQueryDTO, HttpServletResponse response) throws IOException {
        String message = "update stock success";
        Map result = new HashMap();
        List<StockDataVO> list = stockDataService.listStockData(stockQueryDTO);
        WebUtils.putSuccessResult(message, list);
        return result;
    }
}
