package com.hai.draw.drawcdemo;

import javax.swing.*;
import java.awt.*;

/**
 * @author hai
 * @date 2022/1/14
 * version 1.0
 */
public class DrawGraph extends JFrame {

    // define MyPaint
    MyPanel mp = null;

    public DrawGraph() {
        // 初始化mp
        mp = new MyPanel();

        // 设置画框的大小
        this.setSize(400, 400);
        this.setVisible(true);

        // 将画板置于画框中
        this.add(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
