package edu.umsl;

public abstract class Animal extends Creature {

    @Override
    public String eatFood(){

        return "INGESTION";
    }

    @Override
    public String modeOfReproduction(){

        return "SEXUAL REPRODUCTION";
    }

    @Override
    public String toString(){
        return "Hello from Animal class";
    }
}
