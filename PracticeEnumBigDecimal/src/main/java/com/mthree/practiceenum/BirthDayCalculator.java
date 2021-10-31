/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.practiceenum;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author salon
 */
public class BirthDayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        System.out.println("");
        System.out.println("What's your birthday?");
        String sDate=sc.nextLine();
        LocalDate ld;
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        ld=LocalDate.parse(sDate,formatter);
        System.out.println(ld);
        String formatted=ld.format(formatter);
        System.out.println(formatted);
        
        java.time.DayOfWeek dayOfWeek = ld.getDayOfWeek();
        //System.out.println("Day of week in number:"+dayOfWeek.getValue());
       // System.out.println("Day of week in text:"+dayOfWeek.toString());
        System.out.println("That's means you were born on a "+ dayOfWeek.toString() +"!");
        
        LocalDate date = LocalDate.now();
        System.out.println(date);
        Period diff=ld.until(date);
        System.out.println("And since today is "+date.toString()+", You are " + diff.getYears()+" Years "+diff.getMonths()+" Months "+diff.getDays()+" Days old.");
       
        if(diff.isNegative())
        {
            System.out.println("date must me in past.");
        }
        
    }    
}
