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
        String finalSy = "My Company copy right is \u00A9 2015";
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
        int result = 1 + 2;

        int previousResult = result % 2;

        System.out.println("value of previsous result " + previousResult);

        previousResult--;
        System.out.println("value previousResult--: " + previousResult);

        previousResult = previousResult + 2;
        System.out.println("previousResult = " + previousResult);
        previousResult += 2;
        System.out.println("previousResult += 2: " + previousResult);
        previousResult *= previousResult;
        System.out.println("previousResult *= " + previousResult);
        previousResult -= previousResult;
        System.out.println("previousResult -= " + previousResult);

        boolean isAlien = false;
        int topScore = 100;
        int secondTopScore = 90;
        if (isAlien == false && topScore != 100) {
            System.out.println("It is not an alien!");
        }
        if (topScore > secondTopScore || topScore < 95) {
            System.out.println("It is right");
        }
        // one equal sign is an assignment while two equal signs are comparisons
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("you must use boolean variable in the if condition");
        }
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("As an expression the value in the brace returns whatever is assigned" +
                    "to it.");
            System.out.println("why we do not have an error is the assignment " +
                    "statement is assigning a boolean value to the value");
        }
        isCar = false;
        System.out.println("boolean value of isCar: " + isCar);
        // ternary operator
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar value: " + wasCar);

        //keywords and expressions
        /*
         * There are 53 words in java which are keywords
         * expressions are building blocks of java programs
         * examples of expressions in java
         * */

        //only --> kilometers = (100 * 50) is an expression, double and ; are java variable declaration
        // and we are creating valid java expressions
        double kilometers = (100 * 50);
        /*only highScore = 50 is an expression while int and ; are used in here to form a
        valid java program. Also the keyword if and the parenthesis () and curly brace are not
        part of an expression. Only the highScore == 50 is an expression.
        * Also the string in the print out statement is an expression.
        */
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //data type and expression with a finishing statement semicolon--> the whole thing is
        // a complete java statement
        int myVariable = 50;
        //java statement can be multiple lines
        System.out.println("This is " +
                "java statement " +
                "which have many lines of code.");
        // indentation makes the logical flow of the code easy to understand for the reader

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("Your score is 5000.");


        /*
        * A code block is a grouping of two or more statements, this is done by grouping the
        * statements between opening and closing curly braces.
        * Variables created inside an if else code block gets destroyed once the code
        * between the curly braces executed. so, it is not possible to access those variables
        * from outside of the code block and display them.
        * */

        boolean codeBlock = false;
        if (codeBlock == false) {
            int var1 = 4;
            int var2 = var1 * 2;
            System.out.println("Var2 can be accessed from here only: " + var2);
        }
        //you can not access var1 and va2 from here

        // This is similar to the above code block, but it works or used to compare if the boolean
        // variable is true, if it is it will let the code block to run
        // or it means the if clause runs if the expression inside the if clause computes to true.
        if (!codeBlock) {
            int var1 = 4;
            int var2 = var1 * 4;
            System.out.println("Var2 can be accessed from here only: " + var2);
        }
    }
}
