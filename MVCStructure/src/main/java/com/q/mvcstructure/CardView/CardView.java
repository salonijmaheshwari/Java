/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q.mvcstructure.CardView;

import com.q.mvcstructure.DTO.Card;
import java.util.Scanner;

/**
 *
 * @author Quinten Lambert
 */
public class CardView {
    
    Scanner sc = new Scanner(System.in);
    
    public int printMenuAndGetSelection(){
        System.out.println("1. Add Card");
        
        return Integer.parseInt(sc.nextLine());
    }
    
    public Card getCardInfo(){
        Card card = new Card();
        
        System.out.println("Enter name");
        card.setCardName(sc.nextLine());
        
        System.out.println("Enter value");
        card.setCardValue(sc.nextLine());
        
        System.out.println("Enter suit");
        card.setSuit(sc.nextLine());
        
        return card;
    }
    
    public void printAddBanner(){
        System.out.println("-------ADDING CARD--------");
    }
}
