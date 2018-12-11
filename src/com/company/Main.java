package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to a Harry Potter based Text Adventure.");
        System.out.println("You are a student attending Hogwarts, the school of Witchcraft and Wizardry.");
        System.out.println("What's your name?");
        String name = in.nextLine();
        while (name.length() > 20)
        {
            System.out.println("Please pick a name under 20 characters.");
        }
        

        System.out.println("Hogwarts is divided into 4 houses: Gryffindor, Hufflepuff, Ravenclaw, and Slytherin.");
        System.out.println("Which house do you belong to?");
        String statement = in.nextLine();
        statement = statement.toLowerCase();

        while ((!statement.equals("Gryffindor")) || (!statement.equals("Hufflepuff")) || (!statement.equals("Ravenclaw")) || (!statement.equals("Slytherin")))
        {
            System.out.println("Please pick a house. Check your spelling and capitalization, because it's very case-sensitive");
            statement = in.nextLine();
            statement = statement.toLowerCase();
        }

        String house = statement;

	// write your code here
    }
}
