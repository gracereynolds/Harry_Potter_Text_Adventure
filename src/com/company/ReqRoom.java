package com.company;

public class ReqRoom extends Room {
    private int c, d;
    public ReqRoom (int x, int y, int c, int d)
    {
        super(x, y);
        this.c = c;
        this.d = d;
    }
    @Override
    public void enterRoom(Player a)
    {
        person = a;
        a.setX(this.x);
        a.setY(this.y);
        b.board[a.getY()][a.getX()] = "[@]";
        System.out.println("Pacing back and forth in a hallway, thinking about how much you need to get to class, you open the room of Requirement.");
        System.out.println("In it, you find a map with the Transfiguration classroom marked on it.");
        System.out.println("You get 15 house points for your discovery.");
        a.points += 15;
        a.turns += 3;
        b.board[c][d] = "[X]";
    }
    @Override
    public void exitRoom(Player a)
    {
        person = a;
        b.board[a.getX()][a.getY()] = "[+]";
        a.turns++;
        person = null;

    }
}
