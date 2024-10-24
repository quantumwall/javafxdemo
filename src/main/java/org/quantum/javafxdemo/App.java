package org.quantum.javafxdemo;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
	stage.setTitle("Hello world!");
	stage.setWidth(300);
	stage.setHeight(200);
	
	setIcon(stage);
	stage.setScene(getLabeledScene("Label!"));
	stage.show();
    }
    
    public static void main(String[] args) {
	launch();
    }
    
    private Scene getLabeledScene(String labelTest) {
	Label label = new Label(labelTest);
	label.setAlignment(Pos.CENTER);
	return new Scene(label);
	
    }
    
    private void setIcon(Stage stage) {
	InputStream iconStream = App.class.getResourceAsStream("/idea.png");
	Image image = new Image(iconStream);
	stage.getIcons().add(image);
    }

}