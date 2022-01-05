package com.hai.polymorphic;
/*
    食物类：父类
 */
public class Food {
    // 属性
    private String foodName;

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
