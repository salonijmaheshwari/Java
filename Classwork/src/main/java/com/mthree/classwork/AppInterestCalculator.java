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
public class AppInterestCalculator {
    public static void main(String[] args) {
        Scanner inputNumber= new Scanner(System.in);
        RefectorInterestCalculator rf = new RefectorInterestCalculator();
        
        System.out.println("How much do you want to invest?");
        
        rf.setPrincipalS(inputNumber.nextLine());
        rf.setPrincipal(Integer.parseInt(rf.getPrincipalS()));
        
        System.out.println("How many years are investing?");
        
        rf.setYearsS(inputNumber.nextLine());
        rf.setYears(Integer.parseInt(rf.getYearsS()));
        
        System.out.println("What is the annual interest rate % growth?");
        
        rf.setiRateS(inputNumber.nextLine());
        rf.setiRate(Double.parseDouble(rf.getiRateS()));
        
        double quarterlyInterestRate=rf.findQuarterlyInterestRate(rf.getiRate());
        
        rf.calculateFinalPrincipal(rf.getPrincipal(), quarterlyInterestRate);
        
    }
    
}
