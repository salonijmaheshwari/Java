/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;

import java.util.Random;
import java.util.Scanner;


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
       
        double r1=r.nextInt(100);
        double r2=r.nextInt(100);
        double r3=r.nextInt(100);
        double r4=r.nextInt(100);
        double r5=r.nextInt(100);
        double sum=r1+r2+r3+r4+r5;
     
        int r11=(int)(r1/sum*100);
        int r22=(int)(r2/sum*100);
        int r33=(int)(r3/sum*100);
        int r44=(int)(r4/sum*100);
        int r55=(int)(r5/sum*100);
        
        System.out.println(r11 + "% St. Bernard");
        System.out.println(r22 + "% Chihuahua");
        System.out.println(r33 + "% Dramatic RedNosed Asian Pug");
        System.out.println(r44 + "% Common Cur");
        System.out.println(r55 + "% King Doberman");
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");

    }
}


