package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public abstract class Piece {

    protected int[][] shape; //forma de la pieza, puede ser una matriz de valores
    private int x,y;         // posición de la pieza en el tablero
    protected int sizeX,sizeY; //tamaño de la pieza en el tablero
    private Color color;
    private boolean active;


    public Piece(Color color){
        this.color = color;
        this.x = 4;
        this.y = 2;
        this.active = true;
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

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public Color getColor() {
        return color;
    }

    protected void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    protected void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public void setInactive(){
        this.active = false;
    }

    public void rotate(){

        int[][] rotatedShape = new int[sizeX][sizeY];

        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                rotatedShape[j][sizeY - 1 - i] = shape[i][j];
            }
        }
        shape = rotatedShape;
    }

    public void moveLeft(Board board){
        if(active && !collisionX(-1,board))
            x--;
    }

    public void moveRight(Board board){
        if(active && !collisionX(1,board))
            x++;
    }

    public void moveDown(Board board){
        if(active && !collisionY(board))
            y++;
    }

    public boolean collisionX(int i, Board board){
        if((getY()+getSizeY()) < (board.getRows() -board.getHighestLine()))
            return i<0 ?  getX()==0 : (getX() + getSizeX()) == board.getCols();

        if( (i<0 && getX()==0) || (i>0 && getX() + getSizeX() == board.getCols() ) ){

            return true;
        }

        int aux=0, j=getY();

        if(i<0) {
            while (aux < getSizeY()  && j < getY() + getSizeY()) {
                if (board.getBoard()[j][getX() - 1] == 1 && shape[aux][0] == 1)
                    return true;
                j++;
                aux++;
            }
        }else {
            while (aux < getSizeY() && j <  getY()+ getSizeY()) {
                if (board.getBoard()[j][getX()+1] == 1 && shape[aux][getSizeX()-1] == 1)
                    return true;
                j++;
                aux++;
            }
        }
        return false;
    }

    public boolean collisionY(Board board){
        if( (getY()+getSizeY() -1) < board.getRows()-board.getHighestLine())
            return false;

        int aux = 0;
        while (aux < getSizeX()){
            if (shape[getY()+getSizeY()-1][aux+getX()] == 1 && board.getBoard()[getY()+getSizeY()][aux+getX()] == 1){
                setInactive();
                return true;
            }
            aux++;
        }
        return false;
    }

}
