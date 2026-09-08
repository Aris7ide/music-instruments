package com.music.model;

public class WindInstrument extends Instrument {

    public WindInstrument(double price, String name) {
        super(price, name);
    }

    @Override
    public void play() {
        System.out.println("Està suenando un instrumento de aire");
    }
}
