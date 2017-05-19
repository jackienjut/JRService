package com.jackie.jr.controller;

import com.jackie.jr.service.StockDataService;
import com.jackie.jr.utils.HttpUtils;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luhaiming on 2017/1/12 0012.
 */
@Controller
@RequestMapping(value = "/data")
public class DataController {

    @Autowired
    private StockDataService stockDataService;

    @ResponseBody
    @RequestMapping(value = "/testi")
    public String test1(HttpServletResponse response) throws IOException {
        return "this is a test";
    }

    @ResponseBody
    @RequestMapping(value = "/getSystemDate")
    public String getSystemDate(HttpServletResponse response) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd:hhmm");
        return sdf.format(new Date());
    }

    @ResponseBody
    @RequestMapping(value = "/getdata/{stock_id}")
    public String getStockDataById(@RequestParam(value = "stock_id") String stock_id) {
        String url = "http://table.finance.yahoo.com/table.csv?s=%s.sz";
        url = url.replace("%s", stock_id);
        String res = HttpUtils.get(url);
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/updatedata", method = RequestMethod.POST)
    public String updateData() {
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/add/{stockid}", method = RequestMethod.GET)
    public String addData(@PathVariable(value = "stockid") String stockid) {
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addData1(@RequestParam(value = "stockid") String stockid) {
        boolean res = stockDataService.addData(stockid);
        if (res)
            return "success";
        else
            return "failed";
    }
}
