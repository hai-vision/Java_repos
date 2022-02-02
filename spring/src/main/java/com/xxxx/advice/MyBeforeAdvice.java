package com.xxxx.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author hai
 * @date 2022/2/2
 * version 1.0
 */
@SuppressWarnings({"all"})
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("发布消息");
        System.out.println("删除消息");
    }
}
