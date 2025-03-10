package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class ZPiece extends Piece{
    public ZPiece(){
        super(Color.DARKCYAN);
        shape = new int[][]{
            {1,1,0},
            {0,1,1}
        };
    }
}
