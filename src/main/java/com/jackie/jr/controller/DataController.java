package com.jackie.jr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
