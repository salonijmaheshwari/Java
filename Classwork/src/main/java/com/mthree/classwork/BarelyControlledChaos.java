package com.mthree.classwork;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = chooseColor(); // call color method here
        String animal = chooseAnimal(); // call animal method again here
        String colorAgain = chooseColor(); // call color method again here
        int weight = chooseNumber(5,200); // call number method,
            // with a range between 5 - 200
        int distance = chooseNumber(10,20); // call number method,
            // with a range between 10 - 20
        int number = chooseNumber(10000,20000); // call number method,
            // with a range between 10000 - 20000
        int time = chooseNumber(2,6); // call number method,
            // with a range between 2 - 6            
        
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
        
        
    }
    
    
    // ??? Method 1 ???
    public static String chooseColor(){
        Random rm = new Random();
        String[] colors={"Red","Yellow","Gree","Blue","Black"};
        int randomIndex = rm.nextInt(colors.length);
        String c = colors[randomIndex];
        return c; 
    }
    
    // ??? Method 2 ???
    public static String chooseAnimal(){
        Random rm = new Random();
        String[] colors={"Tiger","Lion","Fox","Bear","Elephant"};
        int randomIndex = rm.nextInt(colors.length);
        String a = colors[randomIndex];
        return a;
    }
    // ??? Method 3 ???
    
    public static int chooseNumber(int a,int b){
        
        Random rm = new Random();
        int randomNo=a + rm.nextInt(b+1);
        
        return randomNo;
    }
}
