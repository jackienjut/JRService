package com.jackie.jr.dao.inter;

import com.jackie.jr.dao.model.Idfa;
import com.jackie.jr.dao.model.Stock163;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luhaiming on 2018/2/11 0011.
 */
@Repository("idfaOperation")
public interface IDFAOperation {

    public void addIdfa(Idfa idfa);

}
