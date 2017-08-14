package com.jackie.jr.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luhaiming on 2017/8/14 0014.
 */
public class WebUtils {


    private static final String RES_MSG = "msg";
    private static final String RES_STATUS = "status";
    private static final String RES_DATA = "data";

    // 操作成功
    public static String STATUS_SUCCESS = "0000";
    // 操作失败
    public static String STATUS_ERROR = "0001";
    // 请求参数错误
    public static String STATUS_WRONG_PARAM = "0002";
    // 业务规则校验不通过
    public static String STATUS_CHECK_FAILED = "0003";
    // 已登录，权限验证通过
    public static String STATUS_LOGIN_PASS = "1000";
    // 未登录
    public static String STATUS_LOGIN_FAIL = "1001";
    // 无权限访问
    public static String STATUS_LOGIN_LIMIT = "1002";


    public static Map putResult(String message, String status, Object data) {
        Map result = new HashMap();

        result.put(RES_MSG, message);
        result.put(RES_STATUS, status);
        result.put(RES_DATA, data);

        return result;
    }


    public static Map putSuccessResult(String message, Object data) {
        return putResult(message, STATUS_SUCCESS, data);
    }
}
