/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author salon
 */
public class StateCapitals2 {

    public static void main(String[] args) throws FileNotFoundException{
        Map<String, String> stateCapital = new HashMap<>();
        Scanner sc = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        Scanner src = new Scanner(System.in);
        Random rnd = new Random();
        int count = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] curLine = line.split("::");
            stateCapital.put(curLine[0], curLine[1]);
            count++;
        }
        System.out.println(count + " STATES & CAPITALS ARE LOADED.");
        System.out.println("======================================");
        System.out.println("HERE ARE THE STATES :");

        Set<String> keys = stateCapital.keySet();
        List<String> keyList = new ArrayList<>(keys);
        for (int i = 0; i <= keys.size(); i++) {
            System.out.print(keys + ", ");
        }
        System.out.println("");
        System.out.println("");
        
        int size = keyList.size();
        int randIdx =rnd.nextInt(size);
        String randomKey = keyList.get(randIdx);
        String randomValue = stateCapital.get(randomKey);

        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF '" + randomKey + "'?");
        System.out.println(randomValue);
        
        String compare = src.nextLine();
        
        if(compare.equalsIgnoreCase(randomValue)){
            System.out.println("NICE WORK!"+ compare +"IS CORRECT!"); 
        }else{
            System.out.println("Sorry.Incorrect Answer.");
            System.out.println("The capital of " + randomKey +" is "+ randomValue);
        }
          
          

          

        

    }

}
