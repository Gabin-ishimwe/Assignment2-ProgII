package com.Questions;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("This program is going to take in a user number and return it inverse...");
        System.out.println("Let's goooo.....");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");   // user will enter their number
        int num = input.nextInt();
        String changeNum = Integer.toString(num);   // this line of codes changes the user number into a string
        String newString = "";      // declare an empty string
        for (int i = changeNum.length() - 1; 0 <= i; i--) {     // this for loop iterate through the string and reverse it
            newString += changeNum.charAt(i);   // increment the empty string by the character from the user input number
        }
//        int numString = Integer.parseInt(newString);
        System.out.println("the reverse is " + newString);   // prints the results
        System.out.println("Nice one you did!!!");
    }

}
