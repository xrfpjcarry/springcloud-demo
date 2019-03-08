package com.panjiao.shop.myPractices.exception;

/**
 * Created by xp
 * on 2019/3/1.
 */
public class HandleResult<T> {
    //定义状态代码
    private Integer statusCode;
    //定义提示的信息
    private String msg;
    //定义具体的报错信息
    private T data;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public HandleResult(Integer statusCode, String msg, T data) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.data = data;
    }

    public HandleResult(Integer statusCode, String msg) {
        this.statusCode = statusCode;
        this.msg = msg;
    }
}
