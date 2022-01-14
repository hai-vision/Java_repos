package com.hai.draw.drawcircle;

import java.awt.*;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */

/*
    面板类
 */
public class MyPanel extends Panel {

    //重写构造器方法


    @Override
    public void paint(Graphics g) {
        super.paint(g); // 调用父类构造器，完成初始化

        // 在面板上画一个圆圈
        /*
            x: 要绘制的椭圆的左上角 x 的坐标
            y: 要绘制的椭圆的右上角 y 的坐标
            width: 椭圆的宽
            height: 椭圆的高
         */
        g.drawOval(200, 100, 150, 150);
    }
}
