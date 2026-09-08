package com.music.main;

import com.music.model.Instrument;
import com.music.model.WindInstrument;
import com.music.model.PercussionInstrument;
import com.music.model.StringInstrument;



public class Main {
    static void main(String[] args) {

        WindInstrument flauta = new WindInstrument(150, "Flauta");
        PercussionInstrument tambor = new PercussionInstrument(170,"tambòr");
        StringInstrument violi = new StringInstrument(290,"Violì");

        flauta.play();
        tambor.play();
        violi.play();

    }
}
