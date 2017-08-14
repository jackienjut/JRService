package com.jackie.jr.inter;

import com.jackie.jr.model.Article;

import java.util.List;

/**
 * Created by luhaiming on 2017/5/23 0023.
 */
public interface IUserOperation {

    public List<Article>  getUserArticles(int id);
}
