package com.jackie.jr.web.controller;

import com.jackie.jr.IDFAService;
import com.jackie.jr.dao.model.Idfa;
import com.jackie.jr.web.RetuenSuccess;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;

/**
 * Created by luhaiming on 2018/2/11 0011.
 */
@Controller
@RequestMapping(value = "/idfa")
public class IDFAController {

    @Resource
    private IDFAService idfaService;

    @ResponseBody
    @RequestMapping(value = "/idfa")
    public String test1(@RequestParam("callback") String callback, @RequestParam("resid") String resid) throws IOException {
        Idfa idfa =new Idfa();
        idfa.setCallback(callback);
        idfa.setResid(resid);
        idfa.setDate(new Date());
        idfaService.add(idfa);

        RetuenSuccess retuenSuccess = new RetuenSuccess();
        retuenSuccess.setResult("success");
        retuenSuccess.setCode(200);
        retuenSuccess.setSuccess(1);
        retuenSuccess.setMessage("ok" );
        return JSONObject.fromObject(retuenSuccess).toString();
    }

}
