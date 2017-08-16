package com.jackie.jr.utils;

/**
 * Created by luhaiming on 2017/8/15 0015.
 */
public class UrlUtils {
    //"http://quotes.money.163.com/service/chddata.html?code=0000001&start=19901219&end=20150911&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;VOTURNOVER;VATURNOVER"
    private static final String base_url = "http://quotes.money.163.com/service/chddata.html";
    private static String startDate;
    private static String endDate;
    private static String fields;
    private static String code;

    public static String getFullUrl() {
        if (code == null)
            return null;
        if (startDate != null)
            startDate = "&startDate=" + startDate;
        if (endDate != null)
            endDate = "&endDate=" + endDate;
        if (fields != null)
            fields = "&fields=" + fields;

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

    public static String getFields() {
        return fields;
    }

    public static void setFields(String fields) {
        UrlUtils.fields = fields;
    }

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        UrlUtils.code = code;
    }
}
