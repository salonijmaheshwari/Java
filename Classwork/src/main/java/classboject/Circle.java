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
public class Circle extends Shape{
    
    final double PI=3.14;
    double radius=10;
    @Override
    public double getArea(){
        return PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    }
    
    @Override
    public String getColor(){
        return "Green";
    }
}

