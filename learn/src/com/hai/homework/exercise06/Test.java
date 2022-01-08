package com.hai.homework.exercise06;

/**
 * @author 最佳损友
 * @version 1.0
 */


public class Test {
    public static void main(String[] args) {
        Color red = Color.RED;
        Color[] colors = Color.values();
        for(Color color:colors){
            switch(color){
                case BLUE:
                    System.out.println("匹配到蓝色");
                    color.show();
                    break;
                case RED:
                    System.out.println("匹配到红色");
                    break;
                case GREEN:
                    System.out.println("匹配到绿色");
                    break;
                case BLACK:
                    System.out.println("匹配到黑色");
                    break;
                case YELLOW:
                    System.out.println("匹配到黄色");
                    break;
                default:
                    System.out.println("匹配到未匹配");
                    break;
            }

            color.show();
        }
    }
}
