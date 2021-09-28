/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classboject;

import java.util.Scanner;

/**
 *
 * @author salon
 */
public class AppCalc {

    public static void main(String[] args){
        double result = 0;
        boolean isValid = true;
        Scanner sc = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();
        while (isValid) {
            System.out.println("Enter your choice:");
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.exit");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter First Value:");
                double num1 = Double.parseDouble(sc.nextLine());
                System.out.println("Enter Second Value:");
                double num2 = Double.parseDouble(sc.nextLine());

                switch (choice) {
                    case 1:
                        result = calc.addition(num1, num2);
                        break;
                    case 2:
                        result = calc.subtraction(num1, num2);
                        break;
                    case 3:
                        result = calc.multiplication(num1, num2);
                        break;
                    case 4:
                        result = calc.division(num1, num2);
                        break;

                }
                System.out.println("Result is:" + result);

            } else if(choice==5) {
                System.out.println("Thank you.see you again");
                isValid = false;

            } else{
                System.out.println("Please enter valid input");
            }
            

        }
    }

}
