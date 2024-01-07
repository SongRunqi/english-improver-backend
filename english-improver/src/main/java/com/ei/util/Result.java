package com.ei.util;

import lombok.Data;

import java.io.Serial;
import java.util.Map;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Data
public class Result implements java.io.Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    private ResultType resultType;
    private Operation operation;
    private String message;
    private Map<String, Object> data;

    /**
     *
     * @param msg 描述消息
     * @param operation 操作
     * @param data 数据
     * @return Result
     */
    public static Result success(String msg, Operation operation, Map<String, Object> data) {
        Result result = new Result();
        result.setMessage(msg);
        result.setResultType(ResultType.SUCCESS);
        result.setData(data);
        result.setOperation(operation);
        return result;
    }
    public static Result success(String msg, Operation operation) {

        return success(msg, operation, null);
    }
    public static Result success(Operation operation, Map<String, Object> data) {
        return success(null,operation, data);
    }
    public static Result success(Operation operation) {
        return success(null, operation, null);
    }

    public static Result fail(String msg, Operation operation, Map<String, Object> data) {
        Result result = new Result();
        result.setMessage(msg);
        result.setOperation(operation);
        result.setResultType(ResultType.FAIL);
        result.setData(data);
        return result;
    }
    public static Result fail(String msg, Operation operation) {
        return fail(msg, operation, null);
    }
    public static Result fail(String msg) {
        return fail(msg, null, null);
    }
    public static Result fail(Operation operation) {
        return fail(null, operation, null);
    }

}
