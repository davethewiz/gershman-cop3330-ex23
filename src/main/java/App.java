/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.ArrayList;

public class App
{
    public static String GetNumSuffix(int num) {
        if (num % 10 == 1 && num % 100 != 11)
            return "st";

        if (num % 10 == 2 && num % 100 != 12)
            return "nd";

        if (num % 10 == 3 && num % 100 != 13)
            return "rd";

        return "th";
    }

    public static void main( String[] args )
    {
        int numCount = Input.GetInt("How many numbers are you comparing? ");

        ArrayList<Integer> nums = new ArrayList<Integer>();

        int largestNum = -2147483648;

        for (int i = 1; i <= numCount; i++) {
            int num = Input.GetInt("Enter the " + i + GetNumSuffix(i) + " number: ");

            if (nums.contains(num)) {
                System.out.println("Already entered this number, try again.");
                i--;
            }
            else {
                nums.add(num);

                if (num > largestNum)
                    largestNum = num;
            }
        }

        System.out.printf("The largest number is %d.", largestNum);
    }
}