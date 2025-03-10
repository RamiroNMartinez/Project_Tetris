package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class LPiece extends Piece{
    public LPiece(){
        super(Color.YELLOW);
        shape = new int[][]{
                {0,0,1},
                {1,1,1}
        };
    }

}
