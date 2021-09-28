/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q.mvcstructure.DAO;

import com.q.mvcstructure.DTO.Card;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quinten Lambert
 */
public class CardDAO {
    
    public List<Card> cards = new ArrayList<>();
    
    //CRUD
    
    //create
    public void createCard(Card card){
        cards.add(card);
    }
    
    public void readCards(){
        //read from file
    }
    
    public void writeCards(){
        //write to file
    }
}
