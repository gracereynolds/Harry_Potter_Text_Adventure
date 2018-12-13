package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to a Harry Potter based Text Adventure.");
        System.out.println("You are a student attending Hogwarts, the school of Witchcraft and Wizardry.");
        System.out.println("What's your name, student?");
        String name = in.nextLine();
        while (name.length() > 20)
        {
            System.out.println("Please pick a name under 20 characters.");
        }
        

        System.out.println("Hogwarts is divided into 4 houses: Gryffindor, Hufflepuff, Ravenclaw, and Slytherin.");
        System.out.println("Which house do you belong to?");
        String statement = in.nextLine();
        statement = statement.toLowerCase();


        while (!Player.checkHouse(statement))
        {
            System.out.println("Please pick a house. Check your spelling, too.");
            statement = in.nextLine();
            statement = statement.toLowerCase();
        }

        String house = statement.substring(0,1).toUpperCase() + statement.substring(1);
        System.out.println("Welcome to " +house+ ", " +name+ "!");

	// write your code here
    }
}
