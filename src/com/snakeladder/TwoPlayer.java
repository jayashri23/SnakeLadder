package com.snakeladder;

import java.util.Random;

public class TwoPlayer {
    public static void main(String[] args) {
        String p1 = "Player1";
        String p2 = "Player2";
        int start_position = 0;
        int player1_position = 0;
        int player2_position = 0;
        int winning_position = 100;

        System.out.println("Player Starting Position =" + start_position);
        int count1 = getCount(p1, player1_position, winning_position);
        int count2 = getCount(p1, player2_position, winning_position);

        //comparing and finding the winner
        if (count1 > count2)
            System.out.println(p2 + " is the winner ");
        else if (count2 > count1)
            System.out.println(p1 + "is the  winner");
        else if (count1 == count2)
            System.out.println("Match Draw");
    }
    public static int getCount(String name, int playerPosition,int winPosition){
        Random random = new Random();
        int c = 0;

        do {
            int dieRoll = random.nextInt(1, 7);
            c++;
            System.out.printf("Rolls Die and get number: ", name, dieRoll);

            //checking for option
            int option = random.nextInt(3);
            playerPosition = playerPosition + dieRoll;
            if (option == 0) {
                System.out.printf("No play - Player stays in the same position ", name);
                System.out.printf("Player current position is : ", name, playerPosition);
            } else if (option == 1) {
                playerPosition = playerPosition + dieRoll;
                System.out.printf("Player gets ladder and player moves ahead position : ", name, dieRoll);
                System.out.printf("Player current position :", name, playerPosition);
            } else if (option == 2) {
                playerPosition = playerPosition - dieRoll;
                if (playerPosition <= 0) {
                    playerPosition = 0;
                    System.out.printf("here is snake byte ..& Player is starting from zero ", name);
                    System.out.printf("Player current position :", name, playerPosition);
                } else {
                    System.out.printf("here is snake byte ..& Player moves behind by number of position : ", name, dieRoll);
                    System.out.printf("Player current position : ", name, playerPosition);
                }
            }
            if (playerPosition > winPosition) {
                playerPosition = playerPosition - dieRoll;
                System.out.printf("Position goes beyond 100 ..Player stays in the same position");
                System.out.printf("Player current position : ", name, playerPosition);
                System.out.printf("The number required player : ", name, (winPosition - playerPosition));
            }
        }
         while (playerPosition !=winPosition);
        System.out.printf("Player reaches the winning Position",name);
        System.out.printf("The number of times the dice was roll :" +c);
        return c;
    }
}

