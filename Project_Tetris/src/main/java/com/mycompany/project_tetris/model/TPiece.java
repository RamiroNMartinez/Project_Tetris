package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class TPiece extends Piece{

    public TPiece(){
        super(Color.OLIVE);
        shape = new int[][]{
            {0,1,0},
            {1,1,1}
        };
        setSizeX(shape[0].length);
        setSizeY(shape.length);

    }
}
