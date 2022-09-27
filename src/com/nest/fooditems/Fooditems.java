package com.nest.fooditems;

public class Fooditems {
    int Tea;
    int Coffee;
    int Juice;

    public Fooditems(int tea, int coffee, int juice) {
        Tea = tea;
        Coffee = coffee;
        Juice = juice;
    }

    public int getTea() {
        return Tea;
    }

    public void setTea(int tea) {
        Tea = tea;
    }

    public int getCoffee() {
        return Coffee;
    }

    public void setCoffee(int coffee) {
        Coffee = coffee;
    }

    public int getJuice() {
        return Juice;
    }

    public void setJuice(int juice) {
        Juice = juice;
    }

}
