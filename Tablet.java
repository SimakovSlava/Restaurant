package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Order;


import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

//Планшет
public class Tablet extends Observable {
    private final int number;
    static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    //метод создания заказа
    public Order createOrder() {
        Order order = null;
        try {
            order = new Order(this);
            ConsoleHelper.writeMessage(String.valueOf(order));
            if(!order.isEmpty()){
                setChanged();
                notifyObservers(order);
            }
            return order;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
        if (order != null) {
            return order;
        } else return null;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
