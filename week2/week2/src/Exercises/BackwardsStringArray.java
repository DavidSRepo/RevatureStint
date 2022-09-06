package Exercises;

import java.util.Arrays;

public class BackwardsStringArray {
    public static void main(String[] args) {

        String names[] = {"Joe", "Jasiri", "Skeeter", "Bob", "Larry", "Donald"};
        String hold = "";

        for(int i = 0; i <= names.length/2; i++){

            for(int j = 0; j < names.length/2; j++){
                String word = names[j];
                char reverseL;
                for(int k=0; k<word.length()/2; k++){
                    reverseL = word.charAt(k);
                    hold = reverseL+hold;
                }


            }


            hold = names[i];
            names[i] = names[names.length - i -1];
            names[names.length - i - 1] = hold;

        }
        System.out.println(Arrays.toString(names));
    }





}
