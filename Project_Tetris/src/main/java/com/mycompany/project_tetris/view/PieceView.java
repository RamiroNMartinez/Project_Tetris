package com.mycompany.project_tetris.view;

import com.mycompany.project_tetris.model.Piece;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PieceView {
    private final int cellSize = 30;

    public void drawPiece(GraphicsContext gc, Piece piece, int offsetX, int offsetY){
        gc.setFill(piece.getColor());

        for(int[] block : piece.getShape()){
            int x = block[0]+offsetX;
            int y = block[1]+offsetY;
            gc.fillRect(x*cellSize,y*cellSize,cellSize,cellSize);
            gc.setStroke(Color.BLACK);
            gc.strokeRect(x*cellSize,y*cellSize,cellSize,cellSize);
        }
    }
}
