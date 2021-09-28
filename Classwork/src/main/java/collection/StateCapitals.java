/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author salon
 */
public class StateCapitals {

    public static void main(String[] args) {
        Map<String, String> sc = new HashMap<>();

        sc.put("Alabama", "Montgomery");
        sc.put("Alaska", "Juneau");
        sc.put("Arizona", "Phoenix");
        sc.put("Arkansas", "Little Rock");
        
        Set<String> keys = sc.keySet();
        Collection<String> values = sc.values();
        
        System.out.println("States");
        System.out.println("==========");
        
        for(String state : keys){
            System.out.println(state);
        }
        System.out.println("Capitals");
        System.out.println("==========");
        
        for(String capital:values){
            System.out.println(capital);
        }
        System.out.println("States:Capital Pairs");
        System.out.println("=======================");
        
        for(String state:keys){
            System.out.println(state+ ":"+ sc.get(state) );
        }
    }
    
}
