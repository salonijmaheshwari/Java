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
public class AppFactorizer {
    public static void main(String[] args){
        
        RefectorFactorizer rf = new RefectorFactorizer();
        Scanner inputNumber= new Scanner(System.in);
        
        System.out.println("What number would you like to factor?");
        
        rf.setStringNumber(inputNumber.nextLine());
        rf.setNumber(Integer.parseInt(rf.getStringNumber()));
        int a=rf.getNumber();
        rf.findFactor(a);
        
    }
    
}
