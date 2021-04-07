package edu.umsl;

public class Cow extends Animal {

    private String sound = "MOOOO";

    //Default constructor
    public Cow(){
        super();
    }

    @Override
    public String toString(){

        return "A cow intakes food by " + eatFood() + ".\n" +
                "It reproduces through " + modeOfReproduction() + ".\n" +
                "It communicates by saying " + sound + ".";

    }
}
