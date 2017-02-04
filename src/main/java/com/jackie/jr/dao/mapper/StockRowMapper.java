package com.jackie.jr.dao.mapper;

import com.jackie.jr.model.Stock;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by luhaiming on 2017/2/4 0004.
 */
public class StockRowMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Stock stock = new Stock();

        stock.setStockid(resultSet.getInt("stockid"));
        stock.setDate(resultSet.getDate("date"));
        stock.setOpen(resultSet.getDouble("open"));
        stock.setHigh(resultSet.getDouble("high"));
        stock.setLow(resultSet.getDouble("low"));
        stock.setClose(resultSet.getDouble("close"));
        stock.setVolume(resultSet.getInt("volume"));
        stock.setAdjclose(resultSet.getDouble("adjclose"));
        return stock;
    }
}
