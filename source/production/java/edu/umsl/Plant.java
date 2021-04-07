package edu.umsl;

public abstract class Plant extends Creature {

    @Override
    public String eatFood(){

        return "SUNLIGHT(AKA PHOTOSYNTHESIS)";
    }

    @Override
    public String modeOfReproduction(){

        return "SEEDS";
    }

    @Override
    public String toString(){
        return "Hello from Plant class";
    }

}
