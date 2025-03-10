package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class JPiece extends Piece{
    public JPiece(){
        super(Color.PURPLE);
        shape = new int[][]{
                {1,0,0},
                {1,1,1}
        };
    }
}
