package com.mycompany.project_tetris.model;

public class Board {

    private int[][] board;
    private final int limit = 17;
    private int highestLine;

    public Board(){
        this.board = new int[20][10];
        this.highestLine = 0;
    }

    public int getHighestLine() {
        return highestLine;
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean gameOn(){
        return highestLine < limit;
    }

    //public
}
