package com.hai.draw.drawcircle;

import javax.swing.*;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class DrawCicle extends JFrame {
    // JFrame 相当于一个画框
    // Panel 相当于一个画板
    // 画板置于画框中

    // 定义一个面板
    MyPanel mp = null;
    public DrawCicle() {
        // 初始化面板
        mp = new MyPanel();
        // 设置画框的大小
        this.setSize(700, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mp);
    }
}
