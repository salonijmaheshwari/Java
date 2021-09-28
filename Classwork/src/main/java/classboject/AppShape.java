/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classboject;

/**
 *
 * @author salon
 */
public class AppShape {
    public static void main(String[] args) {
        Square sq1=new Square();
        Circle cir1=new Circle();
        
        System.out.println("Area of Square is:"+sq1.getArea());
        System.out.println("Perimeter of Square is:"+sq1.getPerimeter());
        System.out.println("Color of Square is:"+sq1.getColor());
        
        System.out.println("Area of Square is:"+cir1.getArea());
        System.out.println("Perimeter of Square is:"+cir1.getPerimeter());
        System.out.println("Color of Square is:"+cir1.getColor());
        
    }
    
}
