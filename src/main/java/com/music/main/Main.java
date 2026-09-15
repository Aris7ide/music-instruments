package com.music.main;

import com.music.model.Instrument;
import com.music.model.WindInstrument;
import com.music.model.PercussionInstrument;
import com.music.model.StringInstrument;



public class Main {
    static void main(String[] args) {

        System.out.println("Inicio del programa");

        System.out.println("Creando primera flauta:");
        WindInstrument flauta1 = new WindInstrument(150,"Flauta 1");

        System.out.println("Creando segunda flauta");
        WindInstrument flauta2 = new WindInstrument(160,"Flauta 2");

        WindInstrument.showInfo();
        WindInstrument.showInfo();

        WindInstrument flauta = new WindInstrument(150, "Flauta");
        PercussionInstrument tambor = new PercussionInstrument(170,"tambòr");
        StringInstrument violi = new StringInstrument(290,"Violì");

        flauta.play();
        tambor.play();
        violi.play();

    }
}
