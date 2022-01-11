package com.hai.collection_.list_;

import java.util.ArrayList;

/**
 * @author 最佳损友
 * @version 1.0
 */
public class ListExercise03 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for(int i = 11; i <= 15; i++){
            list.add(i);
        }
    }
}
