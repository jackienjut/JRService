package com.jackie.jr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by luhaiming on 2017/1/12 0012.
 */
public class DataController {
    @ResponseBody
    @RequestMapping(value="/testi")
    public String test1(HttpServletResponse response) throws IOException {
        return "this is a test";
    }
}
