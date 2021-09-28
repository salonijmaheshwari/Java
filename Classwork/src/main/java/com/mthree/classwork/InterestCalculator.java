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
public class InterestCalculator {
    public static void main(String args[]){
        double temp;
        
        
        Scanner inputNumber= new Scanner(System.in);
        
        System.out.println("How much do you want to invest?");
        String principalS = inputNumber.nextLine();
        double principal =Double.parseDouble(principalS);
        
        System.out.println("How many years are investing?");
        String YearsS = inputNumber.nextLine();
        int Years =Integer.parseInt(YearsS);
        
        System.out.println("What is the annual interest rate % growth?");
         
        String iRates = inputNumber.nextLine();
        double iRate =Double.parseDouble(iRates);
        
        double QuarterlyInterestRate = iRate/4;
        
        System.out.println("Calculating...");
        
        for(int i=1;i<=Years;i++){
            System.out.println("Year " +i+ ":");
            temp=principal;
            
            for(int j=1;j<=4;j++){
                principal *= (1 + (QuarterlyInterestRate / 100));
            }
            double earned = principal - temp;
            String temp1 = String.format("%.02f", temp);
            System.out.println("Began with $" + temp1);
            String earn = String.format("%.02f", earned);
            System.out.println("Earned $"+earn);
            String principal1 = String.format("%.02f", principal);
            System.out.println("Ended with $"+principal1);
            System.out.println("");
        }
    }
}
