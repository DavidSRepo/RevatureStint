package Tuesday.Inheritance;

public class Animal {

    double weight;
    int eyes;
    int legs;
    String species;
    String sound;
    Boolean warmBlood;

    public Animal( double weight, int eyes, int legs, String species, String sound, boolean warmBlood){
        this.weight = weight;
        this.eyes = eyes;
        this.legs = legs;
        this.species = species;
        this.sound = species;
        this.warmBlood = warmBlood;

    }

    //empty constructor
    public Animal(){

    }
    public void speak(){
        System.out.println("This animal says: "+ this.sound);
    }

    public void speakSpecific(){
        System.out.println("The " + this.species + "says: " + this.sound);
    }


}
