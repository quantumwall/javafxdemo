package org.quantum.javafxdemo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/MainScene.fxml"));
	Parent root = fxmlLoader.load();
	stage.setScene(new Scene(root));
//	stage.setTitle("Hello world!");
//	stage.setWidth(300);
//	stage.setHeight(200);
//
//	setIcon(stage);
//	stage.setScene(getLabeledScene("Label!"));
	stage.show();
    }

    public static void main(String[] args) {
	launch();
    }

//    private Scene getLabeledScene(String labelTest) {
//	Label label = new Label(labelTest);
//	label.setAlignment(Pos.CENTER);
//	return new Scene(label);
//
//    }
//
//    private void setIcon(Stage stage) {
//	InputStream iconStream = App.class.getResourceAsStream("/idea.png");
//	Image image = new Image(iconStream);
//	stage.getIcons().add(image);
//    }

}