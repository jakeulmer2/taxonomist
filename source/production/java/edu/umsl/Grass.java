package edu.umsl;

public class Grass extends Plant {

    private String benefit = "PREVENTS EROSION";

    //Default constructor
    Grass(){
        super();
    }

    @Override
    public String toString(){

        return "Grass intakes food by " + eatFood() + ".\n" +
                "It reproduces through " + modeOfReproduction() + ".\n" +
                "Grass is beneficial because it " + benefit + ".";

    }


}
