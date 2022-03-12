package com.example.bookkeeper;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    //Character Creation data
    @FXML
    private TextField nameField;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private TextField ageField;
    @FXML
    private TextField genderField;
    @FXML
    private TextField sexualityField;
    @FXML
    private TextField raceSpeciesField;
    @FXML
    private TextField raceSkinColorField;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Will save to Data Base");
    }
}
