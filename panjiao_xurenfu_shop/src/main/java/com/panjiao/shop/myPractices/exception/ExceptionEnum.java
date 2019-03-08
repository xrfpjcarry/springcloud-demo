package com.panjiao.shop.myPractices.exception;

/**
 * Created by xp
 * on 2019/3/1.
 */
public enum  ExceptionEnum {

    UNKONW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "我猜你可能还在上小学"),
    MIDDLE_SCHOOL(101, "你可能在上初中"),
    ;
    private Integer exceptionCode;

    private String msg;

    ExceptionEnum(Integer exceptionCode, String msg) {
        this.exceptionCode = exceptionCode;
        this.msg = msg;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }

    public String getMsg() {
        return msg;
    }
}
