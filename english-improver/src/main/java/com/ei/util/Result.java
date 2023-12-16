package com.ei.util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Data
public class Result implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private Integer code;
    private String msg;
    private Map<String, Object> data;

    public static Result success(String msg) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg(msg);
        return result;
    }
    public static Result success(Map<String, Object> data) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("success");
        result.setData(data);
        return result;
    }
    public static Result fail() {
        Result result = new Result();
        result.setCode(400);
        result.setMsg("fail");
        return result;
    }
    public static Result fail(String msg) {
        Result result = new Result();
        result.setCode(400);
        result.setMsg(msg);
        return result;
    }
}
