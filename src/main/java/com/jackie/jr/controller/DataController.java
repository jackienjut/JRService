package com.jackie.jr.controller;

import com.jackie.jr.utils.HttpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luhaiming on 2017/1/12 0012.
 */
@Controller
public class DataController {
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
    @RequestMapping(value = "/getstockdata/{stock_id}")
    public String getStockDataById(@RequestParam(value = "stock_id") String stock_id) {
        String url = "http://table.finance.yahoo.com/table.csv?s=%s.sz";
        url = url.replace("%s", stock_id);
        String res = HttpUtils.get(url);
        return res;
    }
}
