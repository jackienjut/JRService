package com.jackie.jr.controller;


import com.jackie.jr.dao.StockDAO;
import com.jackie.jr.model.Article;
import com.jackie.jr.mybatis.inter.IUserOperation;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    IUserOperation userOperation;

    @ResponseBody
    @RequestMapping("/list")
    public String listall(HttpServletRequest request, HttpServletResponse response) {
        List<Article> articles = userOperation.getUserArticles(1);
        return JSONArray.fromObject(articles).toString();
    }

}
