package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class ZPiece extends Piece{
    public ZPiece(){
        super(Color.CYAN);
        shape = new int[][]{
            {1,1,0},
            {0,1,1}
        };
        setSizeX(shape[0].length);
        setSizeY(shape.length);

    }



}
