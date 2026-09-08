package com.music.model;

public class PercussionInstrument extends Instrument{

    public PercussionInstrument(double price, String name) {
        super(price, name);
    }

    @Override
    public void play() {
        System.out.println("Està sonando un instrumento de percusiones");
    }
}
