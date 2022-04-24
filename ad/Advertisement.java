package com.javarush.task.task27.task2712.ad;

//Рекламное объявление
public class Advertisement {
    private Object content;
    private String name;
    private long initialAmount; //стоимость рекламы в копейках
    private int hits; //количество оплаченных заказов
    private int duration; //продолжительность в сек рекламы

    private long amountPerOneDisplaying; //стоимость за один заказ

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        if (hits != 0)
            this.amountPerOneDisplaying = initialAmount / hits;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate(){
        if(hits <= 0){
            throw new UnsupportedOperationException();
        }
        hits --;
    }
}
