package com.hai.abstract_.exercise;

abstract public class Template {
    public abstract void job();

    // 计算一个任务完成的时间
    public void calc(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务完成时间是：" + (end - start));
    }
}
