/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q.mvcstructure.Controller;

import com.q.mvcstructure.CardView.CardView;
import com.q.mvcstructure.DAO.CardDAO;
import com.q.mvcstructure.DTO.Card;

/**
 *
 * @author Quinten Lambert
 */
public class CardController {
    
    CardView cv = new CardView();
    CardDAO cd = new CardDAO();
    
    public void run(){
        int selection = cv.printMenuAndGetSelection();
        
        //cd.readCard();
        
        switch(selection){
            case 1:
                createCard();
                break;
        }
        
        for(Card card : cd.cards){
            System.out.println(card.getCardName());
        }
    }
    
    public void createCard(){
        cv.printAddBanner();
        Card card = cv.getCardInfo();
        cd.createCard(card);
    }
}
