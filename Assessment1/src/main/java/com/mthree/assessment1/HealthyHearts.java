package com.mthree.assessment1;

import java.util.Scanner;

public class HealthyHearts {
     public static void main(String[] args){
        //created object of Scanner class
        Scanner ir = new Scanner(System.in);
        int age;
        
        System.out.println("What is your age?");
        
        //read input from user
        age = Integer.parseInt(ir.nextLine());
        int maxhr = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxhr +" beats per minute.");
        
        double minhrzone = maxhr * 0.50;
        double maxhrzone = maxhr * 0.85;
        System.out.println("Your target HR Zone is " + minhrzone + "-" + maxhrzone + " beats per minute.");
        
    }
}
