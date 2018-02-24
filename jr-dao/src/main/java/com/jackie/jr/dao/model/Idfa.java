package com.jackie.jr.dao.model;

import java.util.Date;

/**
 * Created by luhaiming on 2018/2/11 0011.
 */
public class Idfa {
    public int id;
    public String callback;
    public String resid;
    public Date date;

    public String getCallback() {
        return callback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getResid() {
        return resid;
    }

    public void setResid(String resid) {
        this.resid = resid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
