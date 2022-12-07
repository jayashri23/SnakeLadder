package com.snakeladder;

import java.util.Random;

public class PlayTillWin {
    public static void main(String[] args) {
        int start_position = 0;
        int player_position = 0 ;
        int winning_position = 100;
        Random random = new Random();
        System.out.println("Player Starting Position =" +start_position);
        do {
            int dieRoll = random.nextInt(1, 7);
            System.out.println("Rolls Die and get number:" + dieRoll);

            //checking for position
            int option = random.nextInt(3);
            player_position = player_position + dieRoll;
            if (option == 0){
                System.out.println("No play - Player stays in the same position ");
                System.out.println("Player current position is : " +player_position);
            }else if (option == 1){
                player_position = player_position +dieRoll ;
                System.out.println("Player gets ladder and player moves ahead position : " +dieRoll);
                System.out.println("Player current position :"+ player_position);
            }else if (option == 2){
                player_position = player_position - dieRoll;
                if (player_position <= 0 ){
                    player_position = 0;
                    System.out.println("here is snake byte ..& Player is starting from zero ");
                    System.out.println("Player current position :"+ player_position);
                }else {
                    System.out.println("here is snake byte ..& Player moves behind by number of position : "+dieRoll);
                    System.out.println("Player current position : " +player_position);
                }
            }
        }
        while (player_position !=winning_position && player_position <= winning_position);
        System.out.println("Player reaches the winning Position");
        }
    }
