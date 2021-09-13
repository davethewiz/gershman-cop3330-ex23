/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 *
 *  A helpful class that handles all forms of scanner input and
 *  error handling.
 */


import java.util.Scanner;

public class Input {
    public static String GetString(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static double GetDouble(String request) {
        String input = GetString(request);

        try {
            return Double.parseDouble(input);
        }
        catch (NumberFormatException e) {
            System.out.println("Input was not a number, try again.");
            return GetDouble(request);
        }
    }

    public static int GetInt(String request) {
        String input = GetString(request);

        try {
            return Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            System.out.println("Input was not an integer, try again.");
            return GetInt(request);
        }
    }
}
