package Wednesday;

import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner judge = new Scanner(System.in);

        System.out.print("What was you grade?");

        int grade = judge.nextInt();

        if(grade >= 90) {
            System.out.println("Way to go, you get an A");

        }
        else if(grade > 79 ){
            System.out.println("Pretty good, you got a B");
        }
        else if(grade >69){
            System.out.println("Fair try, you got a C");
        }
        else if(grade > 59){
            System.out.println("Try a little harder next time, you got a D");

        }
        else{
            System.out.println("Get it together, you got an F");
        }



    }
}
