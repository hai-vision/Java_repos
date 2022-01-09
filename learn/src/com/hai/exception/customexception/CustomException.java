package com.hai.exception.customexception;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if(!(age >= 0 && age <= 120)){
            // 抛出异常
            throw new AgeScopeException("年龄范围必须在0-120之间");
        }
        System.out.println("在正常范围");

    }
}

class AgeScopeException extends RuntimeException {

    public AgeScopeException(String message){
//        System.out.println(message);
        say();
    }

    public void say() {
        System.out.println("error");
    }
}
