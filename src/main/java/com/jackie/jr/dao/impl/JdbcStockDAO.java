package com.jackie.jr.dao.impl;

import com.jackie.jr.dao.StockDAO;
import com.jackie.jr.dao.mapper.StockRowMapper;
import com.jackie.jr.model.Stock;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luhaiming on 2017/2/4 0004.
 */
public class JdbcStockDAO implements StockDAO {

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(Stock stock) {
        String sql = "INSERT INTO historystockinfo" +
                "(stockid , date , open ,high , low ,close, volume , adjclose)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql , new Object[]{
                stock.getStockid() ,  stock.getDate() , stock.getOpen() ,stock.getHigh(),
                stock.getLow() , stock.getClose() ,  stock.getVolume() , stock.getAdjclose()
        });
    }

    @Override
    public Stock findByCustomerId(int id) {
        String sql = "SELECT * FROM historystockinfo WHERE stockid = ?";

        Stock stock = (Stock) jdbcTemplate.queryForObject(sql ,
                new Object[]{id} , new StockRowMapper());
        return stock;
    }

    @Override
    public void insertBatch(List<Stock> stockList) {

    }
}
