package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        Button statsPage = new Button("Statistieken");

        BorderPane bp = new BorderPane();
        bp.setCenter(statsPage);
        Scene scene = new Scene(bp);

        stage.setTitle(
                "Jan-Paul van Buuren (2204743), Jord Vermeulen (), Jelle van Pol(2203205), Kenan van der Heijden (2197280)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
