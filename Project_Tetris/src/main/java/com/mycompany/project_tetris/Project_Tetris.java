package com.mycompany.project_tetris;

import com.mycompany.project_tetris.model.Board;
import com.mycompany.project_tetris.view.GameView;
import com.mycompany.project_tetris.view.Scoreboard;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project_Tetris extends Application {


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GameView gameView = new GameView(10,20);
        Scoreboard scoreboard = new Scoreboard(140,90);
        Board board = new Board();

        //Crear un grupo para la escena
        Group root = new Group();

        root.getChildren().add(gameView.getCanvas());
        root.getChildren().add(scoreboard.getCanvas());

        //Crear la escena
        Scene scene = new Scene(root,300,600);

        //Configurar el título de la ventana
        primaryStage.setTitle("Tetris");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        while (board.gameOn()){
            //play
            int i;
        }


    }
}
