package com.Questions;

import java.util.Random;    // imported random module
import java.util.Scanner;   // import scanner module

public class Question2 {
    public static void main(String[] args) {
        System.out.println("I have a favourite number between 0 and 30");
        System.out.println("Guess my favorite number!!!");
        System.out.println("");
        int matchValue = randGenerator(0, 30);  // this line of code will generate random number from 0 to 30
        int counting = 0;   // this integer will help us count the number of trails the user attempts
        while (true) {  // this loop will alway run if the condition given is true
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess the number: "); // user inputs their number
            int guessNum = scanner.nextInt();
            if (matchValue == guessNum){    // this condition evaluates if the user inputed correct number
                System.out.println("Congrats!!! you got it :)");    // print statement
                System.out.println("Favorite number is " + matchValue); // prints the correct answer
                System.out.println("Matching value found after " + counting + " trials");   // prints number of trails the user tried
                break;  // it breaks the loop because user got the correct answer
            }
            else {
                counting += 1;  // counting variable is incremented by 1 each time user guess incorrect number
                if (guessNum > matchValue) {    // this condition evaluates the range of the user input number and correct value
                    System.out.println("Very high, try again!!!");  // prints the results
                }
                else {  // if the condition above is not fulfilled, it runs the codes in this else block
                    System.out.println("Too low, try again!!!"); // prints the results
                }
            }
        }
    }

    public static int randGenerator(int start, int finish) {    // this function will help generate random number in range of 0 to 30
        Random randNum = new Random();      // instantiated random module
        int favNumber = randNum.nextInt(finish+1 - start) + start;  // declared the range of our number using parameters passed in the function
        return favNumber;   // returns the random number generated
    }
}
