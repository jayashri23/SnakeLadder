package com.snakeladder;
import java.util.Random;

public class CheckOption {

    public static void main(String[] args) {

        int startPosition =0;
        int playerPosition = 0;
        System.out.println("Player Starting Position =" +startPosition);
        Random random = new Random();
        int die = random.nextInt(1, 7);
        System.out.println(" Roll Die and get number:" + die);
        int option = random.nextInt(3);
        if ( option == 0 )
        {
            System.out.println("No play Player at same Position..!");
        }
        else if (option == 1)
        {
            System.out.println("Here is  ladder..go a head");
            playerPosition = playerPosition +die;
            System.out.println("Player Position = " + playerPosition);
        } else
        {
            System.out.println("Here is Snake ... go down");
            playerPosition = playerPosition -die;
            System.out.println("Player Position = " + playerPosition);
            }
        }
    }

