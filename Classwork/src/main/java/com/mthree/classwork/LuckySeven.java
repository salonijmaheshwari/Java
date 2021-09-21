/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;

import java.util.Random;
import java.util.Scanner;

public class LuckySeven {
    public static void main(String args[]){
        int count=0;
        int maxDollar;
        int maxCountNo =0;
        String stringTotalMoney;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many dollars do you have?");
        stringTotalMoney = sc.nextLine();
        int totalMoney = Integer.parseInt(stringTotalMoney);
        
        Random rm = new Random();
        maxDollar=totalMoney;
        
        while(totalMoney != 0){
                        
            int d1=rm.nextInt(6)+1;
            int d2=rm.nextInt(6)+1;
            
            int sum=d1+d2;
            
            if(sum==7){
                totalMoney+=4;
            }else{
                totalMoney-=1;
            }
            
            count++;
            
            if(maxDollar<totalMoney){
                maxDollar=totalMoney;
                maxCountNo=count;
            }
        }
        System.out.println("You are broke after "+count +  " rolls.");
        System.out.println("You should have quit after " +maxCountNo+ " rolls when you had $" +maxDollar);
    }
}    
    
      