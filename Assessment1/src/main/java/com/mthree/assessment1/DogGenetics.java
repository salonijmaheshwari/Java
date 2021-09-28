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
public class DogGenetics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogName = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println("");
        System.out.println(dogName + " is:");
        System.out.println("");
        //create 5 random integers
        Random r = new Random();
       
        int r1=1+r.nextInt(100);
        int x=100-r1;
        int r2=1+r.nextInt(x);
        x=100-r1-r2;
        int r3=1+r.nextInt(x);
        x=100-r1-r2-r3;
        int r4=1+r.nextInt(x);
        int r5=100-r1-r2-r3-r4;
        
        System.out.println(r1+ "% St. Bernard");
        System.out.println(r2 + "% Chihuahua");
        System.out.println(r3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(r4 + "% Common Cur");
        System.out.println(r5 + "% King Doberman");
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");

    }

}
