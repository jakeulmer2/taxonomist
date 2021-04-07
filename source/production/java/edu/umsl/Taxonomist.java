package edu.umsl;
import java.util.Set;
import java.util.HashSet;

public class Taxonomist {
    public static void main(String [] args){

        //Creating a new object of each class
        Cow cow = new Cow();
        Pig pig = new Pig();
        Mushroom mushroom = new Mushroom();
        Truffles truffles = new Truffles();
        Tree tree = new Tree();
        Grass grass = new Grass();


        //Creating a set for Animals, Plants, and Fungi and adding each new object to them
        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(cow);
        animalSet.add(pig);

        Set<Plant> plantSet = new HashSet<>();
        plantSet.add(tree);
        plantSet.add(grass);

        Set<Fungi> fungiSet = new HashSet<>();
        fungiSet.add(mushroom);
        fungiSet.add(truffles);

        //Printing out each set with toString method
        animalSet.forEach(element -> System.out.println(element.toString() + "\n"));
        System.out.println();
        plantSet.forEach(element -> System.out.println(element.toString() + "\n"));
        System.out.println();
        fungiSet.forEach(element -> System.out.println(element.toString() + "\n"));
    }
}
