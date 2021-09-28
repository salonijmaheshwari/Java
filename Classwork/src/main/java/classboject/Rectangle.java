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
public class Rectangle extends Shape {
     double length=10;
     double width=15;
     
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
    
    @Override
    public String getColor(){
        return "Yellow";
    }
}
