package com.LickingHeights;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(" Welcome to the Number Guessing game!");
        System.out.println("The rules are easy-peasy-lemon-squeezy.");
        System.out.println(" First, I will pick a number and you have to try to guess it.");
        System.out.println(" The number that I pick will between 1 and  20.");
        System.out.println(" If you guess lower than my number, I will let you know that you guessed too low, ");
        System.out.println(" if you guess higher than my number, I will let you know that you guessed too high.");
        System.out.println("Lets play then, shall we?");

        Scanner keyboard;
        NumberGuessingGame();
        int counter;
        int guess = 0;
    }

    public static void NumberGuessingGame() {
        int secretNumber;
        String answer;

        Scanner keyboard = new Scanner(System.in);
        int guess;

    }
}