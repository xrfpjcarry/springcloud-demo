package com.panjiao.shop.myPractices.aop;


import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by xp
 * on 2019/2/18.
 */
@Aspect
@Component
@Log4j2
public class LogAop {
  /*  //定义切点
    @Pointcut("execution(* com.cloud.example..*(..))")
    public void saoLog(){};
    //定义异常增强方式
    @AfterThrowing(throwing = "ex",pointcut = "saoLog()")
    public void logException(Throwable ex){
        log.info("exception{}",ex);
    }
    //定义环绕增强方式
    @Around("saoLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        long starte =System.currentTimeMillis();
        try {
            Object proceed = joinPoint.proceed();
            long end=System.currentTimeMillis();
            log.info("{}:time={}",joinPoint.getSignature(),(end-starte));
            return proceed;
        } catch (Throwable throwable) {
            long end=System.currentTimeMillis();
            log.info("{}:time={}",joinPoint.getSignature(),(end-starte));
            throw  throwable;
        }
    }*/
}
