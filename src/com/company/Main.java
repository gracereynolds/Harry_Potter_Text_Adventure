package com.company;

import java.util.Scanner;

public class Main {

    private static boolean gameOn = true;


    public static void main(String[] args) {

        Board map = new Board(5,5);
        map.fill();
        map.edit("[_]",0,0);

        // map is visually printed, board holds info on all the rooms

        // fill board with empty hallways
        Room[][] board = new Room[5][5];
        for (int x = 0; x < board.length; x++){
            for (int y = 0; y < board[x].length; y++){
                board[x][y] = new Room(x,y);
            }
        }



        // create random winning room thats not at 0,0
        int x = (int)(Math.random()*board.length);
        int y = (int)(Math.random()*board.length);
        while (x + y == 0){
            x = (int)(Math.random()*board.length);
            y = (int)(Math.random()*board.length);
        }
        board[x][y] = new ClassRoom(x,y);

        int XClassroom = x;
        int YClassroom = y;

        // this is so that ReqRoom won't overwrite the Classroom
        while ((x == XClassroom) && (y == YClassroom)){
            while (x + y == 0){
                x = (int)(Math.random()*board.length);
                y = (int)(Math.random()*board.length);
            }
        }
        int XReqRoom = x;
        int YReqRoom = y;

        board[x][y] = new ReqRoom(x,y,YClassroom,XClassroom);
        //add the rest of the rooms into the board




        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to a Harry Potter themed Text Adventure.");
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
        System.out.println("");
        //unfinished: describe setting and rules and stuff, introductory
        //make a key to let player know which symbols mean what
        // @ = player

        Player player1 = new Player(name,house);
        board[0][0].enterRoom(player1);
        while (gameOn){
            System.out.println(map);
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, board))
            {
                System.out.println(map);
            }
            else {
                System.out.println("Please choose a valid move.");
            }
        }
        in.close();
        gameOff();

    }

    public static boolean validMove(String move, Player a, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (a.getX() > 0)
                {
                    map[a.getX()][a.getY()].exitRoom(a);
                    map[a.getX()-1][a.getY()].enterRoom(a);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (a.getY()< map[a.getY()].length -1)
                {
                    map[a.getX()][a.getY()].exitRoom(a);
                    map[a.getX()][a.getY() + 1].enterRoom(a);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (a.getX() < map.length - 1)
                {
                    map[a.getX()][a.getY()].exitRoom(a);
                    map[a.getX()+1][a.getY()].enterRoom(a);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (a.getY() > 0)
                {
                    map[a.getX()][a.getY()].exitRoom(a);
                    map[a.getX()][a.getY()-1].enterRoom(a);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }

}
