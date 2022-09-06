package Thursday.Abstraction.Interfaces;

public class Frog implements LandAnimals, WaterAnimals{

    public void walk(){
        System.out.println("The frog hops away");
    }

    public void run(){
        System.out.println("The frog hops faster as if hes trying to get away");
    }

    public void swim(){
        System.out.println("Froggy style");
    }
}
