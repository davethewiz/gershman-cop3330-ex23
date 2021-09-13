/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Hashtable;

public class App
{
    public static double GetBAC(double A, double W, double r, double H) {
        return (A * 5.14 / W * r) - 0.015 * H;
    }

    public static void main( String[] args )
    {
        int gender = Input.GetInt("Enter a 1 if you are male or a 2 if you are female: ");
        double oz_alcohol = Input.GetDouble("How many ounces of alcohol did you have? ");
        double weight = Input.GetDouble("What is your weight in pounds? ");
        double hours = Input.GetDouble("How many hours has it been since your last drink? ");

        double r = 0f;
        if (gender == 1)
            r = 0.73f;
        else if (gender == 2)
            r = 0.66f;

        double BAC = GetBAC(oz_alcohol, weight, r, hours);

        System.out.printf("Your BAC is %.6f\n", BAC);

        if (BAC >= 0.08)
            System.out.print("It is not legal for you to drive.");
        else
            System.out.print("It is legal for you to drive.");
    }
}