/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Scanner;

/**
 *
 * @author salon
 */
public class UserIOImpl implements UserIO {

    Scanner sc = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);

    }

    @Override
    public String readString(String prompt) {

        print(prompt);
        String m = sc.nextLine();
        return m;
    }

    @Override
    public int readInt(String prompt) {

        print(prompt);
        int num = Integer.parseInt(sc.nextLine());
        return num;
    }

    @Override
    public int readInt(String prompt, int min, int max) {

        int num = readInt(prompt);
        while (num < min || num > max) {
            System.out.println("Please Enter Valid Number.");
            num = Integer.parseInt(sc.nextLine());
        }
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        double num = Double.parseDouble(sc.nextLine());
        return num;

    }

    @Override
    public double readDouble(String prompt, double min, double max) {

        double num = readDouble(prompt);

        while (num < min || num > max) {
            System.out.println("Please Enter Valid Number.");
            num = Double.parseDouble(sc.nextLine());
        }
        return num;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        float num = Float.parseFloat(sc.nextLine());
        return num;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {

        float num = readFloat(prompt);

        while (num < min || num > max) {
            System.out.println("Please Enter Valid Number.");
            num = Float.parseFloat(sc.nextLine());
        }
        return num;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        long num = Long.parseLong(sc.nextLine());
        return num;
    }

    @Override
    public long readLong(String prompt, long min, long max) {

        long num = readLong(prompt);

        while (num < min || num > max) {
            System.out.println("Please Enter Valid Number.");
            num = Long.parseLong(sc.nextLine());
        }

        return num;

    }
}
