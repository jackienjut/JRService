package com.jackie.jr.controller;


import com.jackie.jr.dao.StockDAO;
import com.jackie.jr.model.Article;
import com.jackie.jr.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by luhaiming on 2017/1/24 0024.
 */
@Controller
@RequestMapping("/article")
public class UserController {

    @Autowired
    public StockDAO stockDao;

    @RequestMapping("/list")
    public String listall(HttpServletRequest request, HttpServletResponse response) {
        Stock stock = stockDao.findByCustomerId(1);
        System.out.println(stock.getAdjclose());
        return String.valueOf(stock.getAdjclose());
    }

}
