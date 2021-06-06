package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Klingbiel
 */
/*
Exercise 17 - Blood Alcohol Calculator
Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

Example Output
Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.


Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.

Constraint
Prevent the user from entering non-numeric values.

Challenges
Handle metric units.
Look up the legal BAC limit by state and prompt for the state. Display a message that states whether or not it’s legal to drive based on the computed BAC.
Develop this as a mobile application that makes it easy to record each drink, updating the BAC each time a drink is entered.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 1 if you are a male or a 2 if you are a female: "); int gender = in.nextInt();
        System.out.println("How many ounces of alcohol did you have? "); int ounces = in.nextInt();
        System.out.println("What is your weight, in pounds? "); int pounds = in.nextInt();
        System.out.println("How many hours has it been since your last drink? "); int hours = in.nextInt();
        System.out.println();
        double bac = 0;
        if (gender == 1)
            bac = ((ounces * 5.14/pounds * 0.73) - (0.15 * hours));
        else if (gender == 2)
            bac = ((ounces * 5.14/pounds * 0.66) - (0.15 * hours));
        System.out.println("Your BAC is " + bac);
        if (bac < 0.08)
            System.out.println("It is legal for you to drive.");
        else System.out.println("It is not legal for you to drive.");
    }
}
