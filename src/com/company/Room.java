package com.company;

public class Room {
    int x, y;
    Player person;
    Board b;
    public Room(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void enterRoom(Player a)
    {
        System.out.println("You enter the hallway.");
        person = a;
        a.setX(this.x);
        a.setY(this.y);
    }
    public void exitRoom(Player a)
    {
        b.board[person.getY()][person.getX()] = "[_]";
        person = null;

    }


}

