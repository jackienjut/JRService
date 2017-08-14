package com.jackie.jr.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by luhaiming on 2017/1/24 0024.
 */
@Controller
@RequestMapping("/article")
public class UserController {

    @ResponseBody
    @RequestMapping("/list")
    public String listall(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }

}
