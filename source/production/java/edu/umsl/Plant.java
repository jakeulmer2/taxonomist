package edu.umsl;

public abstract class Plant extends Creature {

    @Override
    public String eatFood(){
        return "sunlight (aka photosynthesis)";
    }

    @Override
    public String modeOfReproduction(){
        return "Seeds";
    }

}
