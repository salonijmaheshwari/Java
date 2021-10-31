/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.classwork;

import java.util.Scanner;

/**
 *
 * @author salon
 */
public class EnumMathOperator {

   

    public enum MathOperator {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Choose from PLUS, MINUS, MULTIPLY and DIVIDE:");
        MathOperator op = MathOperator.valueOf(sc.nextLine());
        System.out.println("Enter first value:");
        int op1=sc.nextInt();
        System.out.println("Enter second value:");
        int op2=sc.nextInt();
        
        System.out.println(op);         
    
        int result = calculate(op,op1,op2);
        System.out.println(result);
    
        }
    
    

    public static int calculate(MathOperator operator, int operand1, int operand2) {
        switch (operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
        
    }
    
}

    