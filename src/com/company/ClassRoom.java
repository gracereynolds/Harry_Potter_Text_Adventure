package com.company;

public class ClassRoom extends Room {
    public ClassRoom(int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Player a)
    {
        person = a;
        a.setX(this.x);
        a.setY(this.y);
        System.out.print("Professor McGonagall looks up as you enter the class room. 'Ah, " + a.name + ". ");
        if(a.turns < 50)
        {
            System.out.println("You're early. " + (50 - a.turns) + " points to " + a.House + ", and try to keep this up.");
        } else if (a.turns == 50) {
            System.out.println("Just in time. Sit down and open your textbook to Chapter 1.");
        } else {
            System.out.println("You're late. I should transfigure you into a pocket watch, at least then you'd be on time. " + (a.turns - 50) + " points from ");
        }
    }
}
