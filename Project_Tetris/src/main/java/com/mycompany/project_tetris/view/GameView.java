package com.mycompany.project_tetris.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameView {

    private final Canvas canvas;
    private final GraphicsContext gc;
    private final int cellSize = 30;
    private final int cols;
    private final int rows;

    public GameView(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        this.canvas = new Canvas(cols * cellSize, rows * cellSize);
        this.gc = canvas.getGraphicsContext2D();
        drawGrid();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void drawGrid(){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,canvas.getWidth(), canvas.getHeight());

        gc.setStroke(Color.DARKGRAY);
        for(int i = 0; i < cols; i++) {
            gc.strokeLine(i*cellSize,0,i*cellSize, canvas.getHeight());
        }
        for (int j = 0; j < rows; j++) {
            gc.strokeLine(0,j*cellSize, canvas.getWidth(),j*cellSize);
        }
    }

    public void drawBlock(int x, int y, Color color){
        gc.setFill(color);
        gc.fillRect(x*cellSize,y*cellSize,cellSize,cellSize);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(x*cellSize,y*cellSize,cellSize,cellSize);
    }

    public void clear(){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
        drawGrid();
    }
}
