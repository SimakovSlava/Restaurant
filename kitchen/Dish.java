package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

    public static String allDishesToString(){
        return Dish.FISH + ", " +  Dish.STEAK + ", " + Dish.SOUP + ", " + Dish.JUICE + ", " + Dish.WATER;
    }
}
