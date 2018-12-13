package com.company;

public class Player {

    public static String[] Houses = {"gryffindor","slytherin","hufflepuff","ravenclaw"};
    public static int[][] boardlocations = new int[5][5];
    public String name, House;
    public int xloc, yloc;
    int points = 0;
    int turns = 0;
    public Player(String name, String House)
    {
        this.name = name;
        this.House = House;
        this.xloc = 0;
        this.yloc = 0;
        this.points = 0;
    }
    public int getX()
    {
        return xloc;
    }
    public void setX(int x)
    {
        this.xloc = x;
    }
    public int getY()
    {
        return yloc;
    }
    public void setY(int y)
    {
        this.yloc = y;
    }

    public static boolean checkHouse(String statement){
        for (int i = 0; i < Houses.length; i++){
            if (Houses[i].equals(statement)){
                return true;
            }
        }
        return false;
    }

}
