package ClassesObjects;

public class Wrestler {

    String name;
    String team;
    String year;
    int weightClass;
    int titles;

//The main object and the 5 variable.
public Wrestler(String name, String team, String year, int weightClass, int titles){

    this.name = name;
    this.team = team;
    this.year = year;
    this.weightClass = weightClass;
    this.titles = titles;

}

//Default values
public Wrestler(String name, int weightClass){
    this.name = name;
    this.team = "Unattached";
    this.year = "Senior";
    this.weightClass = weightClass;
    this.titles = 0;



}

@Override
    public String toString(){

    String returnValue = " ";
    returnValue += "This wrestler is " + this.name;
    returnValue += " they are wrestling " + this.weightClass;
    returnValue += " for " + this.team;
    returnValue += " they are a " + this.year;
    returnValue += " they have " + this.titles + " title(s).";
    return returnValue;
}

@Override
    public boolean equals(Object obj){
    if(!(obj instanceof Wrestler)) return false;
    Wrestler other = (Wrestler) obj;
    if(!this.name.equals(other.name)) return false;
    if(!this.year.equals(other.year)) return false;
    if(!this.team.equals(other.team)) return false;
    if(this.weightClass!=(other.weightClass)) return false;
    if (this.titles != other.titles) return false;

    return true;


}

}
