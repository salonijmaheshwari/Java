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
public class MainClass {
    public static void main(String[] args) {
        //5 numbers in alist format
      int diffrence = 0; //1
        int temp; //1
        int[] s = {13, 45, 12, 45, 5}; //1
        //        {0,  ,1,  2, 3,  4}
        //length = 5

        for (int i = 0; i < s.length; i++) { //n
            for (int y = i + 1; y < s.length; y++) { //n-1
                temp = s[y] - s[i]; //n(n-1)
                if (temp > diffrence) { //n(n-1)
                    diffrence = temp; //n(n-1)
                }
            }
        }
        System.out.println(diffrence); //1

            
            
        }
          
    }
/*Given a list of strings [“text”, “tet”, “xtet”, “tte”, “ttex”]
group all the anagrams together and return it. 
Not sure what the fastest time for this could be 
but it can be better than O(n^2), I used a HashMap.
I asked him what were the different approaches to this problem were 
and he said sorting the string was an option, although a HashMap is quicker.*/

