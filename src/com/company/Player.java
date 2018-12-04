package com.company;

public class Player {
    public String name, House;
    public int x, y;
    int points;
    public Player(String name, String House)
    {
        this.name = name;
        this.House = House;
        this.x = 0;
        this.y = 0;
        this.points = 0;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
}
