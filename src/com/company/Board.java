package com.company;

public class Board {
    public String[][] board;
    public Board (int h, int w)
    {
        this.board = new String[h][w];
    }
    public void fill()
    {
        for (int r = 0; r < board.length; r++)
        {
            for (int c = 0; c < board[r].length; c++)
            {
                board[r][c] = "-";
            }
        }
    }
}
