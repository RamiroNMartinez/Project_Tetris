package com.mycompany.project_tetris.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Scoreboard {
    private final Canvas canvas;
    private final GraphicsContext gc;
    private int score = 0;

    public Scoreboard(int width, int height){
        this.canvas = new Canvas(width,height);
        this.gc = canvas.getGraphicsContext2D();
        drawScore();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void updateScore(int points){
        score += points;
        drawScore();
    }

    public void drawScore(){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0, canvas.getWidth(), canvas.getHeight());

        gc.setFill(Color.YELLOW);
        gc.setFont(Font.font("Courier New", FontWeight.BOLD,24));
        gc.fillText("SCORE",10,20);
        gc.fillText(String.format("%05d",score),10,60);
    }
}
