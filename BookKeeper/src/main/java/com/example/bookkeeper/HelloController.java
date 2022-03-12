package com.example.bookkeeper;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    ObservableList<String> genderList = FXCollections.observableArrayList("Select Gender", "Male", "Female", "Non-binary", "Gender Fluid");

    //ObservableList<String> sexualitiesList = FXCollections.observableArrayList("Choose", "Heterosexual", "Homosexual", "Bisexual", "Pansexual", "Asexual");





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
    private ChoiceBox genderChoiceBox;
    @FXML
    private TextField genderField;

    @FXML
    private ChoiceBox sexualityChoiceBox;
    @FXML
    private TextField sexualityField;

    @FXML
    private ChoiceBox raceSpeciesChoiceBox;
    @FXML
    private TextField raceSpeciesField;

    @FXML
    private ChoiceBox raceSkinColorChoiceBox;
    @FXML
    private TextField raceSkinColorField;



    @FXML
    private void initialize()
    {
        genderChoiceBox.setValue("Select Gender");
        genderChoiceBox.setItems(genderList);
    }



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Will save to Data Base");
    }
}
