package com.xxxx.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author hai
 * @date 2022/2/2
 * version 1.0
 * 后置通知，当执行的核心发生异常则不通知
 */
@SuppressWarnings({"all"})
public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知！！");
    }
}
