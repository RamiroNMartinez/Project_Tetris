package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class JPiece extends Piece{
    public JPiece(){
        super(Color.ORANGE);
        shape = new int[][]{
                {1,0,0},
                {1,1,1}
        };
        setSizeX(shape[0].length);
        setSizeY(shape.length);
    }
}
