package com.jackie.jr.web.controller;

import com.jackie.jr.service.StockDataService;
import com.jackie.jr.utils.HttpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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

    @ResponseBody
    @RequestMapping(value = "/test")
    public String test1(HttpServletResponse response) throws IOException {
        return "this is a test";
    }


    @Resource
    private StockDataService stockDataService;

}
