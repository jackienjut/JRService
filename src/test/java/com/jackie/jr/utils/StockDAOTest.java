package com.jackie.jr.utils;

import com.jackie.jr.dao.StockDAO;
import com.jackie.jr.model.Stock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by luhaiming on 2017/2/4 0004.
 */
@Repository
public class StockDAOTest {
    static ApplicationContext ctx;


    @Autowired
    public StockDAO stockDAO;

    static {
        ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
    }


    @Test
    public void testInsert() {
        StockDAO stockDAO = (StockDAO) ctx.getBean("stockDao");
        Stock stock = new Stock(1, new Date(), 12.0, 14.0, 15.0, 14.0, 14, 4.0);
        stockDAO.insert(stock);
    }

    @Test
    public void testFindByCustomerId() {
        StockDAO stockDAO = (StockDAO) ctx.getBean("stockDao");
        Stock stock = stockDAO.findByCustomerId(1);
        System.out.println(stock.getAdjclose());

    }

    @Test
    public void testAutoWiredFindByCustomerId() {
        Stock stock = stockDAO.findByCustomerId(1);
        System.out.println(stock.getAdjclose());

    }

    public void setStockDAO(StockDAO stockDAO) {
        this.stockDAO = stockDAO;
    }

    public StockDAO getStockDAO() {
        return stockDAO;
    }
}
