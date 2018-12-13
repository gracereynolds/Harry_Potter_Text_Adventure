package com.company;

public class Filch extends Room {
    public Filch (int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Player a)
    {
        System.out.println("You run into Filch, who thinks you're up to no good.");
        System.out.println("It takes ages to convince him that you're just trying to get to class.");
        person = a;
        a.setX(this.x);
        a.setY(this.y);
        b.board[a.getY()][a.getX()] = "[@]";
        a.turns += 10;
    }
    @Override
    public void exitRoom(Player a)
    {
        person = a;
        b.board[a.getY()][a.getX()] = "[F]";
        a.turns++;
        person = null;

    }
}
