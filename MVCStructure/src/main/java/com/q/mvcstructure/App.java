/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q.mvcstructure;

import com.q.mvcstructure.Controller.CardController;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Importing files from your own project
import com.q.mvcstructure.DTO.Card;

/**
 *
 * @author Quinten Lambert
 */
public class App {

    private final static String delimiter = "::";
    private final static String file = "test.txt";

    public static void main(String[] args) {
        //CRUD
        //Create - create objects
        //Read - read objects
        //Update - update objects
        //Delete - delete objects
        
        CardController cc = new CardController();
        cc.run();
    }

    public static void exceptionHandling() {
        Scanner sc = new Scanner(System.in);

        try {
            int i = Integer.parseInt(sc.nextLine());
            System.out.println(i);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.toString());
        } finally {
            System.out.println("I will run no matter what happens - error or not");
        }

    }

    public static void marshallUnmarshall() {

        //start program
        //load information from the file
        //run program - make changes
        //just before quitting - write all informaiton back to the file
        //quit the program
        Card card = new Card();

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] curline = line.split(delimiter);
                card.setCardName(curline[0]);
                card.setCardValue(curline[1]);
                card.setSuit(curline[2]);
            }
        } catch (IOException ioe) {
            System.out.println("An error occured");
        }

        System.out.println(card.getCardName());
        System.out.println(card.getCardValue());
        System.out.println(card.getSuit());

        try {
            //public void writeCard(Card card){
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));

            pw.println(card.getCardName() + delimiter
                    + card.getCardValue() + delimiter
                    + card.getSuit());

            pw.flush();
            pw.close();
        } catch (IOException ioe) {
            System.out.println("an error occurred");
        } finally {
            System.out.println("I will run no matter what happens - error or not");
        }

    }

    public static void io() throws Exception {
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));

        pw.println("line 1");

        pw.flush();
        pw.close();

        Scanner sc = new Scanner(new BufferedReader(new FileReader("test.txt")));
        Scanner scs = new Scanner(System.in);

//       while (sc.hasNextLine()){
//           String currentLine = sc.nextLine();
//           System.out.println(currentLine);
//       }
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void collections() {
        //int[] array = new int[6];

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

//        for(int i : list){
//            System.out.println(i);
//        }
//        
//        if (list.contains(6)){
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        
//        System.out.println("First Index:" + list.get(0));
//        
//        list.isEmpty();
//        
//        list.remove(0);
//        
//        list.size();
        //[1, 2, 4, 5]
        //{key : value, key : value}
        Map<Integer, String> hashmap = new HashMap<>();
        Map<String, String> hashmap2 = new HashMap<>();

        hashmap.put(120, "I am the value of key 120");
        hashmap.put(154, "I am the value of key 154");
        hashmap.put(999999, "I am the value of key 999999");
        hashmap.put(100, "I am the value of key 100");
        //System.out.println(hashmap.get(120));

        //System.out.println(hashmap.keySet());
        //System.out.println(hashmap.get(999999));
        //hashmap.put(999999, "Some different value");
        //System.out.println(hashmap.get(999999));
        System.out.println(hashmap.values());

        for (Integer i : hashmap.keySet()) {
            hashmap.get(i);
        }
        for (String i : hashmap2.keySet()) {
            hashmap.get(i);
        }

        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(6);

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
