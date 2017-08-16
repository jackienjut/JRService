package com.jackie.jr.web.controller;

import com.jackie.jr.dto.stock.StockQueryDTO;
import com.jackie.jr.service.StockDataService;
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

import static com.jackie.jr.utils.WebUtils.*;

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
        StockDataVO stockDataVO = stockDataService.listStockData(stockQueryDTO.getStockId());

        return putSuccessResult(message, stockDataVO);
    }

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Map saveStock(StockQueryDTO stockQueryDTO) throws IOException {
        String message = "save stock data success";
        boolean res = stockDataService.saveStockDataByStockID(stockQueryDTO.getStockId());

        return putSuccessResult(message, res);
    }
}
