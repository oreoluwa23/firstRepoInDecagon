package com.games;

import java.util.Scanner;

public class GuessGame {





    public static void main(String[] args) {
        double computerGuessNumber = (int) 1 + (Math.floor(Math.random()* 100));
        System.out.println(computerGuessNumber);
        Scanner input = new Scanner(System.in);

        int numberOfGuess = 0;
        int live = 3;
        int correctGuess = 0;

        while (numberOfGuess < live){
            System.out.println("Guess a number to win!!!");
            int userGuessNumber = input.nextInt();
            if (computerGuessNumber == userGuessNumber){
                System.out.println("Correct!");
                correctGuess++;

            } else if (userGuessNumber > computerGuessNumber){
                System.out.println("Too high, Try again!");

            } else if (userGuessNumber < computerGuessNumber){
                System.out.println("Too low man!!!, Try again");

            }
            live--;
        }

    }
}
