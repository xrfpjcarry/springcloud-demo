package com.panjiao.shop.myPractices.exception;

/**
 * Created by xp
 * on 2019/3/1.
 */
public class GlobException extends RuntimeException {
    //定义异常的状态码
    private Integer exceptionCode;

    public GlobException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.exceptionCode=exceptionEnum.getExceptionCode();
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(Integer exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
}
