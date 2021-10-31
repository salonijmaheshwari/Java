/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.practiceenum;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author salon
 */
public class BigDecimalMath {
    public BigDecimal calculate(MathOperator mathOperator,BigDecimal operand1,BigDecimal operand2) {
        switch (mathOperator) {
            case PLUS:
                return operand1.add(operand2);
            case MINUS:
                return operand1.subtract(operand2);
            case MULTIPLY:
                return operand1.multiply(operand2);
            case DIVIDE:
                return operand1.divide(operand2, 2, RoundingMode.HALF_UP);
            default:
                throw new UnsupportedOperationException("Unknown Math Operator");
    
        }
    }
}
