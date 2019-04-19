/*

Author: J White
Date: 4.18.2019
Task: Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.

*/

package com.company;

import java.util.Scanner;

public class Machine {

    //variables
    Scanner scanner = new Scanner(System.in);
    int amt;

    public void counting() {

        //
        System.out.println("Welcome to the Number-Count-Upper-Nater");
        System.out.println("I am Count. I will be helping you on your number journey");
        System.out.print("Please enter in a number for me to count up to: ");
        amt = scanner.nextInt();

        System.out.println("");

//        while (amt > 0) {

            System.out.println("Counting up to " + amt);

            //
            for (int i = 0; i <= amt; i++) {

                System.out.print(i + " ");
            }

//        }

        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for using Number-Count-Upper-Nater. I hope that I have fulfilled all your counting needs");

    }// end of counting () method

}// end of Machine {}

