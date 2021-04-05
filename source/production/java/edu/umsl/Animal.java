package edu.umsl;

public abstract class Animal extends Creature {

    @Override
    public String eatFood(){
        return "Ingestion";
    }

    @Override
    public String modeOfReproduction(){
        return "Sexual Reproduction";
    }
}
