package edu.umsl;

public class Tree extends Plant {

    private String benefit = "PRODUCE OXYGEN";

    //Default constructor
    Tree(){
        super();
    }

    @Override
    public String toString(){

        return "A tree intakes food by " + eatFood() + ".\n" +
                "It reproduces through " + modeOfReproduction() + ".\n" +
                "Trees are beneficial because they " + benefit + ".";

    }




}
