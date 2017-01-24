package com.jackie.jr.inter;

import com.jackie.jr.model.Article;
import com.jackie.jr.model.User;

import java.util.List;

/**
 * Created by luhaiming on 2017/1/16 0016.
 */
public interface IUserOperation {

    User selectUserByID(int id);

    List<User> selectUsers(String userName);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    public List<Article> getUserArticles(int id);
}
