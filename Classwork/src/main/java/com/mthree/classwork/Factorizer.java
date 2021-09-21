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
public class Factorizer {
    public static void main(String args[]){
        int count = 0;
        int sum = 0;
        
        Scanner inputNumber= new Scanner(System.in);
        
        System.out.println("What number would you like to factor?");
        String stringNumber = inputNumber.nextLine();
        int number=Integer.parseInt(stringNumber);
        System.out.println("The factors of " +number + " are : ");
        for(int i=1; i<=number/2;i++){
            if(number%i == 0 ){
                sum=sum + i;
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println(number);
        System.out.println(number + " has " + (count+1) + " factors." );
        
        if(sum == number){
            System.out.println(number + " is a perfect number.");
        }
        else{
            System.out.println(number + " is not a perfect number.");
        }
        
        if(count == 1){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
        
    }
    
}
