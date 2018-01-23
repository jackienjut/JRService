package com.jackie.jr.dao.inter;

import com.jackie.jr.dao.model.StockCodeName;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luhaiming on 2018/1/16 0016.
 */
@Repository("stockIdMappingOperation")
public interface IStockIdMappingOperation {
    public void insertIntoStockMapping(List<StockCodeName> stockMappings);
    public void deleteStockIdMapping();
    public void deleteAll();

    public List<StockCodeName> selectAll();
}
