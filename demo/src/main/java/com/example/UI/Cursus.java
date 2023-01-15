package com.example.UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Cursus extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Coming soon!");
        Scene scene = new Scene(label);
        stage.setTitle(
                "Jan-Paul van Buuren (2204743), Jord Vermeulen (2203328), Jelle van Pol(2203205), Kenan van der Heijden (2197280)");
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch();
    }

    
}