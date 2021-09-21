/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;

import java.util.Scanner;

/**
 *
 * @author salon
 */
public class HealthyHearts {
    public static void main(String[] args){
        Scanner ir = new Scanner(System.in);
        int age;
        
        System.out.println("What is your age?");
        
        age = Integer.parseInt(ir.nextLine());
        int maxhr = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxhr +" beats per minute.");
        
        int minhrzone = maxhr * 50 / 100;
        int maxhrzone = maxhr * 85 / 100;
        System.out.println("Your target HR Zone is " + minhrzone + "-" + maxhrzone + " beats per minute.");
        
    }
    
}
