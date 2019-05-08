package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        * printed using the unicode value of characters
        *
        *
        * */
        char myChar = '\u00A9';
        char rChar = '\u00AE';
        System.out.println("representing different chars " + myChar);
        System.out.println("register sign char " + rChar);

        /*
        * so far we have covered eight primitive data types these are
        *   byte
        *   short
        *   int
        *   long
        *   float
        *   double
        *   char
        *   boolean
        * */

        //String which is a sequence of characters

        String myString = "This is a string";

        myString = myString + " which you concatenate it.";

        System.out.println("String: " + myString);
        System.out.println();
        String  finalSy = "My Company copy right is \u00A9 2015";
        System.out.println(finalSy);

        //concatinating strings
        String s1 = "10";
        int i1 = 20;
        s1 = s1 + i1;
        double d1 = 122.22;
        String s2 = "Double";
        s2 = s2 + d1;
        System.out.println("Adding int to string gives a string " + s1);
        System.out.println("Adding double to a string is " + s2);


        //operators



    }
}
