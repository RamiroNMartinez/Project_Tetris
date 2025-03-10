module com.mycompany.project_tetris {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.mycompany.project_tetris to javafx.fxml;
    exports com.mycompany.project_tetris;
}