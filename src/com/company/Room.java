package com.company;

public class Room {
    private String[][] building;
    private String str;
    private int row;
    private int column;
    private String map;

    public Room(String[][] building){
        this.building = building;
        this.str = str;
        this.row = row;
        this.column = column;
        this.map = map;
    }

    int x, y;
    public Room(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void enterRoom(Player x){
        System.out.println("You enter the hallway.");
    }

    public String toString(){
        map = "";
        row = 0;
        while (row < building.length){
            column = 0;
            while (column < building[row].length){
                map = map + building[row][column];
                column++;
            }
            map = map + "\n";
            row++;
        }
        return map;
        }

    }

}
