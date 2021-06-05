/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex08;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = in.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = in.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = in.nextInt();
        int totSlices = slices * pizzas, perPerson = totSlices / people, leftovers = totSlices % people;

        System.out.println(people + " people with " + pizzas + " pizzas (" + totSlices + " slices)");
        System.out.println("Each person gets " + perPerson + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");

    }
}
