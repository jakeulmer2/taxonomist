package edu.umsl;

public abstract class Fungi extends Creature{

    @Override
    public String eatFood(){

        return "EXTERNAL DIGESTION WITH HYPHAE";
    }

    @Override
    public String modeOfReproduction(){

        return "SPORES";
    }

    @Override
    public String toString(){
        return "Hello from Fungi class";
    }


}


