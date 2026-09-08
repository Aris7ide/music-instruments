package com.music.model;

public class WindInstrument extends Instrument {

    // Bloque estatico
    static {
        System.out.println("--> [WindInstrument]: Clase cargada en memoria.");
    }

    // Miembro estatico de prueba
    public static void showInfo() {
        System.out.println("--> [WindInstrument]: Método estático invocado.");
    }

    public WindInstrument(double price, String name) {
        super(price, name);
    }

    @Override
    public void play() {
        System.out.println("Està suenando un instrumento de aire");
    }
}
