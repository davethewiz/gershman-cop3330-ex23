/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 *
 *  A helpful class for working with messages that may or may not be questions
 *  with further messages inside them. Deals will all of the input gathering
 *  and checking along with recursive looping of messages as they are printed.
 */

public class Message {
    public String message;
    public Message yes;
    public Message no;

    public Message(String message) {
        this.message = message;
    }

    public void PrintMessage() {
        if (yes != null && no != null) {
            String response = Input.GetString(message + " ").toLowerCase();

            if (response.equals("y")) {
                yes.PrintMessage();
            }
            else if (response.equals("n")) {
                no.PrintMessage();
            }
            else {
                System.out.println("Please enter either a 'y' for yes or an 'n' for no.");
                PrintMessage();
            }
        }
        else {
            System.out.println(message);
        }
    };
}