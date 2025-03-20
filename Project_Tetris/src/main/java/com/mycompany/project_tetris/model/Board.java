package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {

    private int cols = 10;
    private int rows = 20;
    private int[][] board;
    private final int limit = 17;
    private int highestLine;  //
    private ArrayList<Integer> linesWiped;
    private Color color;


    public Color getColor() {
        return color;
    }

    public Board(){
        this.board = new int[rows][cols];
        this.color = Color.GRAY;
        setHighestLine(0);
    }

    public int getHighestLine() {
        return highestLine;
    }

    public int[][] getBoard() {
        return board;
    }

    public void updateBoard(int[][] board){
        this.board = board;
    }

    public boolean gameOn(){
        return highestLine < limit;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public boolean isLine(){
        int i = 0,j = 0; //row adapted
        while (i<highestLine){
            while (j<cols) {
                if(board[i][j]== 1) {
                    if (j == (cols - 1))
                        return true;
                    j++;
                }
                else
                    break;
            }
            j=0;
            i++;
        }
        return false;
    }

    public void lineWipe(){
        int j;
        for (int i = 0; i < highestLine; i++) {
            j=0;
            while(j<cols && board[i][j]==1)
                j++;
            if(j==cols) {
                linesWiped.add(i);
                Arrays.fill(board[i], 0);
            }
        }
    }

    public void setHighestLine(int highestLine) {
        this.highestLine = highestLine;
    }

    public void sorterBoard(){
        for (int size = linesWiped.size()-1 ; size > -1; size--) {
            int auxRow;
            for (auxRow = rows-highestLine; auxRow < linesWiped.get(size); auxRow++) {
                System.arraycopy(board[auxRow], 0, board[auxRow+1], 0, cols);
                Arrays.fill(board[auxRow], 0);
            }
            setHighestLine(rows - auxRow);
        }
        linesWiped.clear();
    }
}
