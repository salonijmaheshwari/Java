/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;

/**
 *
 * @author salon
 */
public class RefectorFactorizer {
    private String stringNumber;
    private int number;
    int sum=0;
    int count=0;

    public String getStringNumber() {
        return stringNumber;
    }
    

    public void setStringNumber(String stringNumber) {
        this.stringNumber = stringNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    public void findFactor(int number){
        this.number = number;
        System.out.println("The factors of " +this.number + " are : ");
        for(int i=1; i<=this.number/2;i++){
            if(this.number%i == 0 ){
                sum=sum + i;
                count++;
                System.out.print(i + " ");
            }
        }
        
        System.out.println(this.number);
        System.out.println(number + " has " + (count+1) + " factors." );
        
        if(sum == number){
            System.out.println(this.number + " is a perfect number.");
        }
        else{
            System.out.println(this.number + " is not a perfect number.");
        }
        
        if(count == 1){
            System.out.println(this.number + " is a prime number");
        }
        else{
            System.out.println(this.number + " is not a prime number");
        }
    }
}
    

