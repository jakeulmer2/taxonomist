package edu.umsl;

public class Pig extends Animal {

    private String sound = "OINK OINK";

    //Default constructor
    public Pig(){

        super();
    }

    @Override
    public String toString(){

        return "A pig intakes food by " + eatFood() + ".\n" +
                "It reproduces through " + modeOfReproduction() + ".\n" +
                "It communicates by saying " + sound + ".";

    }


}
