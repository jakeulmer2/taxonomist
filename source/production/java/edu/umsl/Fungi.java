package edu.umsl;

public abstract class Fungi extends Creature{

    @Override
    public String eatFood(){
        return "External digestion with Hyphae";
    }

    @Override
    public String modeOfReproduction(){
        return "Spores";
    }

}
