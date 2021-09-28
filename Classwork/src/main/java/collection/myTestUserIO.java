/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author salon
 */
public class myTestUserIO {
    public static void main(String[] args) {
        UserIO userIO = new UserIOImpl();
        userIO.print("Hello,Welcome");
        
        
        String str1= userIO.readString("Enter a String:");
        System.out.println("you entered " +str1);
        
        
        int a=userIO.readInt("Enter Integer Value:");
        System.out.println("Integer is:" + a);
        
        
        int b=userIO.readInt("Enter a Integer between 10 to 100",10,100);
        System.out.println("You entered "+b+ " and its within the range.");
        
        double c=userIO.readDouble("Enter Double value:");
        System.out.println("Double is:" + c);
        
        
        double d=userIO.readDouble("Enter a Double between 10 to 100",10,100);
        System.out.println("You entered "+d+ " and its within the range.");
        
        float e=userIO.readFloat("Enter Float Number");
        System.out.println("Float is:" + e);
        
        
        float f=userIO.readFloat("Enter Float between 10 to 100",10,100);
        System.out.println("You entered "+f+ " and its within the range.");
        
        long g=userIO.readLong("Enter your Long Number:");
        System.out.println("Long is:" + g);
        
        
        long h=userIO.readLong("Enter Long between 10 to 100",10,100);
        System.out.println("You entered "+h+ " and its within the range.");
        
        
        
        
        
        
        
    }
}
