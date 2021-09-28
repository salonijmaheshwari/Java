package com.mthree.assessment1;

public class SummativeSums {
    
    public static void main(String[] args) {
        //initialized arrays
        int[] a={ 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] b={ 999, -60, -77, 14, 160, 301 };
        int[] c={ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;
        
        //called methods and stored results in variables
        int resultA=addition(a);
        int resultB=addition(b);
        int resultC=addition(c);
        
        System.out.println("#1 Array Sum:" + resultA);
        System.out.println("#2 Array Sum:" + resultB);
        System.out.println("#3 Array Sum:" + resultC);
    }
    
    //method definition
    public static int addition(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }    
}
