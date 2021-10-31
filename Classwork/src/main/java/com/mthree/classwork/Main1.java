/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;


import java.util.Arrays;


/**
 *
 * @author salon
 */
public class Main1 {
    public static void main(String[] args) {
        
        int[] arr1= {5,7,4,5};
        int[] arr2=new int[4];
       
        int a=0;
        for(int j=0;j<arr1.length;j++){
            for(int k=j+1;k<arr1.length-1;k++){
                if(arr1[j]!=arr1[k]){
                    arr2[a]=arr1[k];
                    a++;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
            
}
