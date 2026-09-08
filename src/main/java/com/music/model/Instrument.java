package com.music.model;

public abstract class Instrument {

    private String name;
    private double price;

    public Instrument(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void play();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
