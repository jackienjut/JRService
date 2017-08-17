package com.jackie.jr.utils;

/**
 * Created by luhaiming on 2017/8/15 0015.
 */
public class UrlUtils {
    //"http://quotes.money.163.com/service/chddata.html?code=0000001&start=19901219&end=20150911&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;VOTURNOVER;VATURNOVER"
    private  final String base_url = "http://quotes.money.163.com/service/chddata.html";
    private  String startDate;
    private  String endDate;
    private  String fields;


    public  String getFullUrl(String code) {
        if (startDate != null)
            startDate = "&startDate=" + startDate;
        else
            startDate = "";

        if (endDate != null)
            endDate = "&endDate=" + endDate;
        else
            endDate = "";

        if (fields != null)
            fields = "&fields=" + fields;
        else
            fields = "";

        return base_url + "?code=" + code + startDate + endDate + fields;
    }

    public String getBase_url() {
        return base_url;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
}
