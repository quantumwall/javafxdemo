package org.quantum.javafxdemo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainSceneController {

    @FXML
    private Button saveButton;
    @FXML
    private Label mainTitle;

    public void onClick() {
	saveButton.setText("Punch me again!");
    }
}
