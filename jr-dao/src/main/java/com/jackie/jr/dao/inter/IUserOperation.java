package com.jackie.jr.dao.inter;

import com.jackie.jr.dao.model.Article;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/23 0023.
 */
public interface IUserOperation {

    public List<Article>  getUserArticles(int id);
}
