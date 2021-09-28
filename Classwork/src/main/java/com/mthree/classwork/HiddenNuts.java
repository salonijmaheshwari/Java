/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;

import java.util.Random;

/**
 *
 * @author salon
 */
public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        
        //hidingSpots[44]="Nut";
        //System.out.println(hidingSpots[44]);
        
        // Nut finding code should go here!
        for (int i=0;i<hidingSpots.length;i++) {
            if (hidingSpots[i]!= null) {
                System.out.println("Found it! It's in spot# " + i);
            }
        }
    }
    
}
