package com.company;

public class Room {
    private Board board;
    private String map;
    int x, y;

    public Room(Board board) {
        this.board = board;
    }

    public Room(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void enterRoom(Player x) {
        System.out.println("You enter the hallway.");
    }

    public String toString() {
        map = "";
        return map;
    }

}

