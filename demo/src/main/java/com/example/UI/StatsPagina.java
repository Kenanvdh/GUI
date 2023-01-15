package com.example.UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StatsPagina{

    public static Scene display() {
        Stage stage1 = new Stage();
        Label label = new Label("Coming soon!");
        Scene scene1 = new Scene(label);
        stage1.setTitle(
                "Jan-Paul van Buuren (2204743), Jord Vermeulen (2203328), Jelle van Pol(2203205), Kenan van der Heijden (2197280)");
        stage1.setScene(scene1);
        stage1.show();
        return scene1;
        
    }

}