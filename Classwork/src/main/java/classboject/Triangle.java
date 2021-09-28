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
public class Triangle extends Shape{
    double base=10;
    double height=15;
    double side1=12;
    double side2=14;
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + base;
    }
    
    @Override
    public String getColor(){
        return "Blue";
    }
}

