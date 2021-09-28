/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.assessment1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author salon
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        String response = "yes";
        System.out.println("Let's Play Rock,Paper,Scissors: ");

        while (response.equalsIgnoreCase("yes")) {
            System.out.println("How many rounds you wants to play?");
            System.out.println("Please enter number from 1 to 10.");
            //scanner class object to read input from console
            Scanner sc = new Scanner(System.in);
            Random rnd = new Random();
            String stringRound = sc.nextLine();
            //parse string to int
            int round = Integer.parseInt(stringRound);
            int roundNo = 1;
            int tie = 0;
            int win = 0;
            int lose = 0;
            if (round >= 1 && round <= 10) {
                System.out.println("Welcome to Rock,Paper,Scissors");

                System.out.println("Enter valid number:");
                System.out.println("1:Rock");
                System.out.println("2:Paper");
                System.out.println("3.Scissors");
                while (roundNo <= round) {

                    System.out.println("Round" + roundNo + ":");
                    String userInput = sc.nextLine();
                    int uInput = Integer.parseInt(userInput);
                    int oInput = 1 + rnd.nextInt(3);

                    if (uInput == oInput) {
                        System.out.println("It's Tie");
                        tie++;
                    } else if ((uInput == 1 && oInput == 3) || (uInput == 2 && oInput == 1) || (uInput == 3 && oInput == 2)) {
                        System.out.println("User won");
                        win++;
                    } else {
                        System.out.println("Computer won");
                        lose++;
                    }
                    roundNo++;
                }
                System.out.println("User won: " + win);
                System.out.println("Computer Won:" + lose);
                System.out.println("tie: " + tie);

                if (win > lose) {
                    System.out.println("Over all User won.");
                } else if (win < lose) {
                    System.out.println("Over all Computer Won.");
                } else {
                    System.out.println("Overall It's Tie");
                }
                System.out.println("Do you want to play again?yes/no");
                response = sc.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    System.out.println("Thanks for playing!");
                }
            } else {

                System.out.println("Invalid input.Try Again.");
                break;
            }

        }
    }

}
