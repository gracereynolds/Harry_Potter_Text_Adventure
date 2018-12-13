package com.company;

public class Peeves extends Room {
    public Peeves (int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Player a)
    {
        System.out.println("Peeves saw you wandering and decided to have some 'fun.'");
        System.out.println("It seem like it took forever for the Bloody Baron to show up and drive him off for you!");
        person = a;
        a.setX(this.x);
        a.setY(this.y);
        b.board[a.getY()][a.getX()] = "[@]";
        a.turns += 15;
    }
    @Override
    public void exitRoom(Player a)
    {
        person = a;
        b.board[a.getY()][a.getX()] = "[P]";
        a.turns++;
        person = null;

    }
}
