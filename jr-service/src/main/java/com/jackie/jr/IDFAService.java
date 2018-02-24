package com.jackie.jr;

import com.jackie.jr.dao.inter.IDFAOperation;
import com.jackie.jr.dao.inter.IStock163Operation;
import com.jackie.jr.dao.model.Idfa;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by luhaiming on 2018/2/11 0011.
 */
@Service("idfaservice")
public class IDFAService {

    @Resource
    private IDFAOperation idfaOperation;

    public void add(Idfa idfa){
        idfaOperation.addIdfa(idfa);
    }
}
