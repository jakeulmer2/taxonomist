package edu.umsl;

public class Mushroom extends Fungi {

    private String grow = "TYPICALLY ABOVE GROUND";

    //Default constructor
    public Mushroom(){
        super();
    }

    @Override
    public String toString(){

        return "A mushroom intakes food by " + eatFood() + ".\n" +
                "It reproduces through " + modeOfReproduction() + ".\n" +
                "It grows " + grow + ".";

    }


}
