package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void writeMessage (String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    //просит выбрать блюдо и добавить в список
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> orderList = new ArrayList<>();

        writeMessage(Dish.allDishesToString());
        writeMessage("Введите название блюда: ");
        writeMessage("<exit> для заверешния заказа.");
        while (true) {
            String order = readString();
            if(order.equals("exit")){
                break;
            }
            if (!order.equals(Dish.FISH.name()) && !order.equals(Dish.JUICE.name()) && !order.equals(Dish.STEAK.name()) &&
            !order.equals(Dish.SOUP.name()) && !order.equals(Dish.WATER.name())){
                writeMessage("Данного блюда нет в нашем заведении. Выберите, пожалуйста, другое блюдо: ");
                continue;
            }
            orderList.add(Dish.valueOf(order));
        }
        return orderList;
    }
}
