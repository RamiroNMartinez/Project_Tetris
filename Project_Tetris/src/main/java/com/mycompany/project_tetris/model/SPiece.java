package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class SPiece extends Piece{
    public SPiece(){
        super(Color.GREEN);
        shape = new int[][]{
            {0,1,1},
            {1,1,0}
        };
    }
}
