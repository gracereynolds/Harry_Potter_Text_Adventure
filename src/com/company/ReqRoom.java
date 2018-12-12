package com.company;

public class ReqRoom extends Room {
    private ClassRoom crm;
    public ReqRoom (int x, int y, ClassRoom crm)
    {
        super(x, y);
        this.crm = crm;
    }
    @Override
    public void enterRoom(Player a)
    {
        person = a;
        a.setX(this.x);
        a.setY(this.y);
        System.out.println("Pacing back and forth in a hallway, thinking about how much you need to get to class, you open the room of Requirement.");
        System.out.println("In it, you find a map with the Transfiguration classroom marked on it.");
        a.turns += 3;
        b.board[crm.y][crm.x] = "[X]";
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
