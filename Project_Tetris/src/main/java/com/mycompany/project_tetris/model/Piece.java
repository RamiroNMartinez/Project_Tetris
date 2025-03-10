package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public abstract class Piece {

    protected int[][] shape; //forma de la pieza, puede ser una matriz de valores
    private int x,y; //posición de la pieza en el tablero
    private Color color;

    public Piece(int [][] shape){
        this.shape = shape;
        this.x=0;
        this.y=0;
        this.color = Color.LIGHTCORAL;
    }

    public Piece(Color color){
        this.color = color;
    }

    public int[][] getShape() {
        return shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void rotate(){
        int cols = shape[0].length;
        int rows = shape.length;
        int[][] rotatedShape = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedShape[j][rows - 1 - i] = shape[i][j];
            }
        }
        shape = rotatedShape;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }

    public void moveDown(){
        y++;
    }

}
