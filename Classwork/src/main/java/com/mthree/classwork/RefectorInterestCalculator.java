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
public class RefectorInterestCalculator {
    double temp;
    private String principalS;
    private int principal;
    private String yearsS;
    private int years;
    private String iRateS;
    private double iRate;

    public String getYearsS() {
        return yearsS;
    }

    public void setYearsS(String yearsS) {
        this.yearsS = yearsS;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getiRateS() {
        return iRateS;
    }

    public void setiRateS(String iRateS) {
        this.iRateS = iRateS;
    }

    public double getiRate() {
        return iRate;
    }

    public void setiRate(double iRate) {
        this.iRate = iRate;
    }
            

    public String getPrincipalS() {
        return principalS;
    }

    public void setPrincipalS(String principalS) {
        this.principalS = principalS;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }
    
    public double findQuarterlyInterestRate(double iRate){
        return iRate/4;
    }
    
    public void calculateFinalPrincipal(double principal,double qIRate){
        for(int i=1;i<=this.years;i++){
            System.out.println("Year " +i+ ":");
            temp=principal;
            
            for(int j=1;j<=4;j++){
                principal *= (1 + (qIRate / 100));
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
