package com.jackie.jr.controller;

import com.jackie.jr.inter.IUserOperation;
import com.jackie.jr.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
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
    IUserOperation userMapper;

    @RequestMapping("/list")
    public String listall(HttpServletRequest request, HttpServletResponse response) {
        List<Article> articles = userMapper.getUserArticles(1);
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("articles", articles);
        return mav.toString();
    }

}
