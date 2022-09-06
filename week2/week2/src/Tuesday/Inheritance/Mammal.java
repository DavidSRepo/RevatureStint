package Tuesday.Inheritance;

public class Mammal extends Animal{

    int litterSize;

    public Mammal(double weight, int eyes, int legs, String species, String sound){
        //calling upon the Animal super class, is super because its the first.
        super(weight, eyes, legs, species, sound, true);
    }

    public Mammal(){
        //ditto
        super();

    }



}
