/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App
{
    public static void main( String[] args )
    {
        Message root = new Message("Is the car silent when you turn the key?");
            root.yes = new Message("Are the terminals corroded?");
                root.yes.yes = new Message("Clean terminals and try starting again.");
                root.yes.no = new Message("Replace cables and try again.");
            root.no = new Message("Does the car make a slicking noise?");
                root.no.yes = new Message("Replace the battery.");
                root.no.no = new Message("Does the car crank up but fail to start?");
                    root.no.no.yes = new Message("Check spark plug connections.");
                    root.no.no.no = new Message("Does the engine start then die?");
                        root.no.no.no.yes = new Message("Does your car have fuel injection?");
                            root.no.no.no.yes.yes = new Message("Get it in for service");
                            root.no.no.no.yes.no = new Message("Check to ensure the choke is opening and closing.");
                        root.no.no.no.no = new Message("This should not be possible.");

        root.PrintMessage();
    }
}