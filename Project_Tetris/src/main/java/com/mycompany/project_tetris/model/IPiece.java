package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class IPiece extends Piece{
    public IPiece(){
        super(Color.RED);
        shape = new int[][]{
            {1,1,1,1}
        };
    }
}
