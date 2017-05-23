package com.jackie.jr;

import com.jackie.jr.model.Stock;
import com.jackie.jr.mybatis.inter.IStockOperation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by luhaiming on 2017/5/22 0022.
 */
public class MybatisTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Stock stock = session.selectOne("com.jackie.jr.model.selectStockByID", 1);
            System.out.print(stock.getAdjclose());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test2() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IStockOperation stockOperation = session.getMapper(IStockOperation.class);

            Stock stock = stockOperation.selectStockByID(1);
            System.out.println(stock.getAdjclose());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test3() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            IStockOperation stockOperation = session.getMapper(IStockOperation.class);

            List<Stock> stocks = stockOperation.selectStocks(1);
            System.out.println(stocks.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test4() {

        Stock stock = new Stock();
        stock.setStockid(110);
        stock.setDate(new Date());
        stock.setOpen(11.0);
        stock.setHigh(12.0);
        stock.setLow(13.0);
        stock.setClose(14.0);
        stock.setVolume(15);
        stock.setAdjclose(16.0);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            IStockOperation stockOperation = session.getMapper(IStockOperation.class);

            stockOperation.addStock(stock);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test5() {

        Stock stock = new Stock();
        stock.setStockid(110);
        stock.setDate(new Date());
        stock.setOpen(110.0);
        stock.setHigh(12.0);
        stock.setLow(13.0);
        stock.setClose(14.0);
        stock.setVolume(15);
        stock.setAdjclose(16.0);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            IStockOperation stockOperation = session.getMapper(IStockOperation.class);

            stockOperation.updateStock(stock);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test6() {

        SqlSession session = sqlSessionFactory.openSession();
        try {
            IStockOperation stockOperation = session.getMapper(IStockOperation.class);

            stockOperation.deleteStock(110);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}
