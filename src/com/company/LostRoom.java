package com.company;

public class LostRoom extends Room{
    public LostRoom(int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Player a)
    {
        System.out.println("Sometimes you wonder how protagonists are always stumbling on ancient secrets of Hogwarts.");
        System.out.print("Then you decide it doesn't matter because you got 100 points for finding the lost");
        if(a.House.equals("gryffindor"))
        {
            System.out.println(" journal of Gryffindor!");
        } else if(a.House.equals("ravenclaw")) {
            System.out.println(" spellbook of Ravenclaw!");
        } else if(a.House.equals("slytherin")) {
            System.out.println(" manuscript of Slytherin!");
        } else if(a.House.equals("hufflepuff")) {
            System.out.println(" healer's guide of Hufflepuff!");
        }
        person = a;
        a.setX(this.x);
        a.setY(this.y);
        b.board[a.getY()][a.getX()] = "[@]";
        a.points += 100;
    }
}
