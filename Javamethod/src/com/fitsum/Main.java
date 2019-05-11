package com.fitsum;

public class Main {

    public static void main(String[] args) {


        int position = calculateHighScore(1000);
        displayHighScorePosition("Bob", position);

        position = calculateHighScore(600);
        displayHighScorePosition("Smith", position);




    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScore(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }


   // we can accomplish the same result with one return statement
   // which is more easy to read
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
