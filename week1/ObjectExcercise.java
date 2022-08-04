package ClassesObjects;

public class ObjectExcercise {

    public static void main(String[] args) {
        //Some actual decent wrestlers/data
        Wrestler man1 = new Wrestler("David Shelton", "Averett University", "Senior", 149, 0);
        Wrestler man2 = new Wrestler("Brandon Woody", "Averett University", "Senior", 141, 0);
        Wrestler man3 = new Wrestler("Trent Ragland", "Averett University", "Senior", 285, 0);
        Wrestler man4 = new Wrestler("Yianni Diakomihalis", "Cornell University", "Senior", 141, 3);
        Wrestler man5 = new Wrestler("Blake Roulo", "George Mason University", "Senior", 149, 0);
        Wrestler man6 = new Wrestler("Gabe LeVay", 149 );


        System.out.println(man1.toString());
        System.out.println(man4.toString());
        System.out.println(man2.getClass());
        System.out.println("Brandon woody to Yianni D.: " + man2.equals(man4));
        System.out.println("Blake R. to Gabe L.:  " + man5.equals(man6));
        System.out.println("David S. to David S.: " + man1.equals(man1));


    }
}