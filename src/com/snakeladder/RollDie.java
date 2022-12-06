package com.snakeladder;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        System.out.println("Player Roll the Die");
        Random random = new Random();
        int die = random.nextInt(1,7);
        System.out.println("Die Number:" +die);
    }
}
