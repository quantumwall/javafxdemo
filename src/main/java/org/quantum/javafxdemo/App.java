package org.quantum.javafxdemo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/StackPaneScene.fxml"));
	Parent root = fxmlLoader.load();
	stage.setScene(new Scene(root, 300, 200));
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