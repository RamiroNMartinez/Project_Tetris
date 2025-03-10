package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class OPiece extends Piece{
    public OPiece() {
        super(Color.BLUE);
        shape = new int[][] {
            {1,1},
            {1,1}
        };
    }

    @Override
    public void rotate(){
        return;
    }
}
