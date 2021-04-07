package edu.umsl;

public class Truffles extends Fungi {

    private String smell = "MUSKY, GARLIC-Y, SULPHUROUS, AND FUNKY";
    private String grow = "UNDERGROUND";

    //Default constructor
    public Truffles(){

        super();
    }

    @Override
    public String toString(){

        return "A truffle intakes food by " + eatFood() + ".\n" +
                "It reproduces through " + modeOfReproduction() + ".\n" +
                "It smells " + smell + ".\n" +
                "It grows " + grow + ".";

    }


}
