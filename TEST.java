//package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TEST extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setScene(returnAskedScene(stage));
		stage.show();
	}

    public Scene returnAskedScene(Stage stage) {
        TEST2 test2 = new TEST2();
        BorderPane borderPane = new BorderPane();

		Label firstText = new Label("First view!");
		Button firstButtonNext = new Button("To the second view!");
		borderPane.setTop(firstText);
		borderPane.setCenter(firstButtonNext);

        firstButtonNext.setOnAction((event) -> {
			stage.setScene(test2.returnAskedScene(stage));
		});

    }
}