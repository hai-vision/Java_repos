package com.hai.draw.drawcdemo;

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

    // 重写父类的构造器


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // 画直线
        //g.drawLine(10, 10, 100,100);

        // 画矩形框
        //g.drawRect(10,10,100,100);
        // 填充矩阵
        // 设置画笔的颜色
        //g.setColor(Color.GREEN);
        //g.fillRect(10,10,100,100);

        // 画字符串
        // 设置画笔的颜色
        //g.setColor(Color.RED);
        // 设置字体
        //g.setFont(new Font("宋体", Font.BOLD, 50));
        //g.drawString("Y Jing", 100, 100);

        // 设置画笔颜色
        g.setColor(Color.CYAN);
        // 填充矩形
        g.fillRect(100, 100, 10, 60);
        g.fillRect(140, 100, 10, 60);
        g.fillOval(110, 115, 30,30);
        g.fillRect(110, 110, 30, 40);
        g.drawLine(125, 120, 125, 40);



    }
}
