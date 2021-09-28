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
public class Square extends Shape{
    double length=10;
    @Override
    public double getArea(){
        return length*length;
    }
    @Override
    public double getPerimeter(){
        return 4*length;
    }
    
    @Override
    public String getColor(){
        return "Red";
    }
}
