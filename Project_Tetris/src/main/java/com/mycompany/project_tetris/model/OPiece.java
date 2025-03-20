package com.mycompany.project_tetris.model;

import javafx.scene.paint.Color;

public class OPiece extends Piece{

    public OPiece() {
        super(Color.BLUE);
        shape = new int[][] {
            {1,1},
            {1,1}
        };
        setSizeX(shape[0].length);
        setSizeY(shape.length);
    }

    @Override
    public void rotate(){
        return;
    }
}
