package com.example.UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class Home extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        Button statsPage = new Button("Statistieken");
        Button account = new Button("Account");
        Button top3 = new Button("Top 3");
        Button cursus = new Button("Cursus");

        statsPage.setMinSize(200, 200);
        statsPage.setStyle(
                "-fx-font-size: 2em; -fx-background-radius: 15px; -fx-background-color: black; -fx-text-fill: #DCDCDC;");

        account.setMinSize(200, 200);
        account.setStyle(
                "-fx-font-size: 2em; -fx-background-radius: 15px; -fx-background-color: black; -fx-text-fill: #DCDCDC;");

        top3.setMinSize(200, 200);
        top3.setStyle(
                "-fx-font-size: 2em; -fx-background-radius: 15px; -fx-background-color: black; -fx-text-fill: #DCDCDC;");

        cursus.setMinSize(200, 200);
        cursus.setStyle(
                "-fx-font-size: 2em; -fx-background-radius: 15px; -fx-background-color: black; -fx-text-fill: #DCDCDC;");

        VBox vbox1 = new VBox();
        vbox1.getChildren().addAll(statsPage, top3);
        vbox1.setAlignment((Pos.CENTER));
        vbox1.setSpacing(25);

        VBox vbox2 = new VBox();
        vbox2.getChildren().addAll(account, cursus);
        vbox2.setAlignment((Pos.CENTER));
        vbox2.setSpacing(25);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(vbox1, vbox2);
        hbox.setSpacing(25);
        hbox.setPadding(new Insets(25));
        hbox.setStyle("-fx-background-color: grey;");
        hbox.setAlignment((Pos.CENTER));

        statsPage.setOnAction((event) -> {
            StatsPagina.display();
        });

        Scene scene = new Scene(hbox);
        stage.setTitle(
                "Jan-Paul van Buuren (2204743), Jord Vermeulen (2203328), Jelle van Pol(2203205), Kenan van der Heijden (2197280)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}