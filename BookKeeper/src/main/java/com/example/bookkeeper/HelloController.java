package com.example.bookkeeper;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
//import java.sql.Connection;
//import java.sql.DriverManager;

public class HelloController
{
//    Connection connection = DriverManager.getConnection();


    ObservableList<String> genderList = FXCollections.observableArrayList("Select Character's Gender",
                                                                               "Male",
                                                                               "Female",
                                                                               "Non-binary",
                                                                               "Gender Fluid",
                                                                               "Other, Please Specify");
    ObservableList<String> sexualitiesList = FXCollections.observableArrayList("Select Character's Sexuality",
                                                                                    "Heterosexual",
                                                                                    "Homosexual",
                                                                                    "Bisexual",
                                                                                    "Pansexual",
                                                                                    "Asexual",
                                                                                    "Other, Please Specify");
    ObservableList<String> raceSpeciesList = FXCollections.observableArrayList("Select Character's Species",
                                                                                    "Human",
                                                                                    "Elf",
                                                                                    "Dwarf",
                                                                                    "Halfling",
                                                                                    "Other, Please Specify");
    ObservableList<String> raceSkinColorList = FXCollections.observableArrayList("Select Character's Skin Color",
                                                                                     "White",
                                                                                     "Black",
                                                                                     "Native American",
                                                                                     "Indian",
                                                                                     "Chinese",
                                                                                     "Filipino",
                                                                                     "Japanese",
                                                                                     "Korean",
                                                                                     "Native Hawaiian",
                                                                                     "Guamanian",
                                                                                     "Chamorro",
                                                                                     "Samoan",
                                                                                     "Other, Please Specify");
    ObservableList<String> hairColorList = FXCollections.observableArrayList("Select Character's Hair Color",
                                                                                 "Redhead/Ginger",
                                                                                 "Blonde",
                                                                                 "Brunette",
                                                                                 "Black",
                                                                                 "White",
                                                                                 "Grey",
                                                                                 "Pink",
                                                                                 "Red",
                                                                                 "Orange",
                                                                                 "Yellow",
                                                                                 "Blue",
                                                                                 "Green",
                                                                                 "Purple",
                                                                                 "Other, Please Specify");
    ObservableList<String> eyeColorList = FXCollections.observableArrayList("Select Character's Eye Color",
                                                                                "Amber",
                                                                                "Blue",
                                                                                "Brown",
                                                                                "Grey",
                                                                                "Green",
                                                                                "Hazel",
                                                                                "Red",
                                                                                "Black",
                                                                                "Purple",
                                                                                "Other, Please Specify");
    ObservableList<String> locationTypeList = FXCollections.observableArrayList("Select Location Type",
                                                                                "Room",
                                                                                "Building",
                                                                                "Park",
                                                                                "Street",
                                                                                "Neighborhood",
                                                                                "Village",
                                                                                "Town",
                                                                                "City",
                                                                                "County",
                                                                                "State",
                                                                                "Province",
                                                                                "Territory",
                                                                                "Country",
                                                                                "Island",
                                                                                "Continent",
                                                                                "Moon",
                                                                                "Planet",
                                                                                "Solar System",
                                                                                "Galaxy",
                                                                                "Universe",
                                                                                "Other, Please Specify");


    @FXML
    private Label welcomeText;
    @FXML
    private Label characterCreationText;
    @FXML
    private Label eventCreationText;
    @FXML
    private Label locationCreationText;
    @FXML
    private Label characterSearchText;
    @FXML
    private Label eventSearchText;
    @FXML
    private Label locationSearchText;

    //CHARACTER CREATION DATA
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
    private ChoiceBox hairColorChoiceBox;
    @FXML
    private TextField hairColorField;

    @FXML
    private ChoiceBox eyeColorChoiceBox;
    @FXML
    private TextField eyeColorField;

    //EVENT CREATION DATA
    @FXML
    private TextField eventNameField;

    @FXML
    private TextArea eventDescriptionArea;

    @FXML
    private TextField eventStartDateField;

    @FXML
    private TextField eventEndDateField;


//    //LOCATION CREATION DATA
    @FXML
    private TextField locationNameField;

    @FXML
    private TextArea locationDescriptionArea;

    @FXML
    private ChoiceBox locationTypeChoiceBox;
    @FXML
    private TextField locationTypeField;


    @FXML
    private TextField characterSearchField;
    @FXML
    private TextField eventSearchField;
    @FXML
    private TextField locationSearchField;



//    @FXML
//    private Button saveButton;

    @FXML
    private void initialize()
    {
        //CHARACTER
        genderChoiceBox.setValue("Select Character's Gender");
        genderChoiceBox.setItems(genderList);
        genderChoiceBox.setOnAction(this::getGender);

        sexualityChoiceBox.setValue("Select Character's Sexuality");
        sexualityChoiceBox.setItems(sexualitiesList);
        sexualityChoiceBox.setOnAction(this::getSexuality);

        raceSpeciesChoiceBox.setValue("Select Character's Species");
        raceSpeciesChoiceBox.setItems(raceSpeciesList);
        raceSpeciesChoiceBox.setOnAction(this::getRaceSpecies);

        raceSkinColorChoiceBox.setValue("Select Character's Skin Color");
        raceSkinColorChoiceBox.setItems(raceSkinColorList);
        raceSkinColorChoiceBox.setOnAction(this::getRaceSkinColor);

        hairColorChoiceBox.setValue("Select Character's Hair Color");
        hairColorChoiceBox.setItems(hairColorList);
        hairColorChoiceBox.setOnAction(this::getHairColor);

        eyeColorChoiceBox.setValue("Select Character's Eye Color");
        eyeColorChoiceBox.setItems(eyeColorList);
        eyeColorChoiceBox.setOnAction(this::getEyeColor);

        //EVENT -N/A

        //LOCATION
        locationTypeChoiceBox.setValue("Select Location Type");
        locationTypeChoiceBox.setItems(locationTypeList);
        locationTypeChoiceBox.setOnAction(this::getLocationType);

        //setting all text fields for choice boxes to be invisible
        //CHARACTER
        genderField.setVisible(false);
        sexualityField.setVisible(false);
        raceSpeciesField.setVisible(false);
        raceSkinColorField.setVisible(false);
        hairColorField.setVisible(false);
        eyeColorField.setVisible(false);
        //EVENT -N/A
        //LOCATION
        locationTypeField.setVisible(false);
    }

    private void getGender(Event event)
    {
        Object newGender = genderChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newGender == "Other, Please Specify")
        {
            genderField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            genderField.setVisible(false);
            genderField.clear();
        }
    }
    private void getSexuality(Event event)
    {
        Object newSexuality = sexualityChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newSexuality == "Other, Please Specify")
        {
            sexualityField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            sexualityField.setVisible(false);
            sexualityField.clear();
        }
    }
    private void getRaceSpecies(Event event)
    {
        Object newSpecies = raceSpeciesChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newSpecies == "Other, Please Specify")
        {
            raceSpeciesField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            raceSpeciesField.setVisible(false);
            raceSpeciesField.clear();
        }
    }
    private void getRaceSkinColor(Event event)
    {
        Object newSkinColor = raceSkinColorChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newSkinColor == "Other, Please Specify")
        {
            raceSkinColorField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            raceSkinColorField.setVisible(false);
            raceSkinColorField.clear();
        }
    }
    private void getHairColor(Event event)
    {
        Object newHairColor = hairColorChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newHairColor == "Other, Please Specify")
        {
            hairColorField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            hairColorField.setVisible(false);
            hairColorField.clear();
        }
    }
    private void getEyeColor(Event event)
    {
        Object newEyeColor = eyeColorChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newEyeColor == "Other, Please Specify")
        {
            eyeColorField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            eyeColorField.setVisible(false);
            eyeColorField.clear();
        }
    }

    //LOCATION
    private void getLocationType(Event event)
    {
        Object newLocationType = locationTypeChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(newLocationType == "Other, Please Specify")
        {
            locationTypeField.setVisible(true);
        }
        else
        {
            //removing text box if it doesn't need to be added
            locationTypeField.setVisible(false);
            locationTypeField.clear();
        }
    }

    //Saving Data to Database
    @FXML
    protected void onCreateCharacterButtonClick()
    {
        String newName = nameField.getText();
        String newDescription = descriptionArea.getText();
        String newAge = ageField.getText();

        String newGender = String.valueOf(genderChoiceBox.getValue());
        if(newGender == "Other, Please Specify")
        {
            newGender = genderField.getText();
        }
        else if (newGender == "Select Character's Gender")
        {
            newGender = "";
        }

        String newSexuality = String.valueOf(sexualityChoiceBox.getValue());
        if(newSexuality == "Other, Please Specify")
        {
            newSexuality = sexualityField.getText();
        }
        else if (newSexuality == "Select Character's Sexuality")
        {
            newSexuality = "";
        }

        String newSpecies = String.valueOf(raceSpeciesChoiceBox.getValue());
        if(newSpecies == "Other, Please Specify")
        {
            newSpecies = raceSpeciesField.getText();
        }
        else if (newSpecies == "Select Character's Species")
        {
            newSpecies = "";
        }

        String newSkinColor = String.valueOf(raceSkinColorChoiceBox.getValue());
        if(newSkinColor == "Other, Please Specify")
        {
            newSkinColor = raceSkinColorField.getText();
        }
        else if (newSkinColor == "Select Character's Skin Color")
        {
            newSkinColor = "";
        }

        String newHairColor = String.valueOf(hairColorChoiceBox.getValue());
        if(newHairColor == "Other, Please Specify")
        {
            newHairColor = hairColorField.getText();
        }
        else if (newHairColor == "Select Character's Hair Color")
        {
            newHairColor = "";
        }

        String newEyeColor = String.valueOf(eyeColorChoiceBox.getValue());
        if(newEyeColor == "Other, Please Specify")
        {
            newEyeColor = eyeColorField.getText();
        }
        else if (newEyeColor == "Select Character's Eye Color")
        {
            newEyeColor = "";
        }

        characterCreationText.setText("Will save character to Data Base");

        System.out.println("--ADDING NEW CHARACTER");
        System.out.println(newName);
        System.out.println(newDescription);
        System.out.println(newAge);
        System.out.println(newGender);
        System.out.println(newSexuality);
        System.out.println(newSpecies);
        System.out.println(newSkinColor);
        System.out.println(newHairColor);
        System.out.println(newEyeColor);
        System.out.println();
    }
    @FXML
    protected void onCreateEventButtonClick()
    {
        String newName = eventNameField.getText();
        String newDescription = eventDescriptionArea.getText();
        String newStart = eventStartDateField.getText();
        String newEnd = eventEndDateField.getText();


        eventCreationText.setText("Will save location to Data Base");

        System.out.println("--ADDING NEW LOCATION");
        System.out.println(newName);
        System.out.println(newDescription);
        System.out.println(newStart);
        System.out.println(newEnd);
        System.out.println();
    }
    @FXML
    protected void onCreateLocationButtonClick()
    {
        String newName = locationNameField.getText();
        String newDescription = locationDescriptionArea.getText();

        String newLocationType = String.valueOf(locationTypeChoiceBox.getValue());
        if(newLocationType == "Other, Please Specify")
        {
            newLocationType = genderField.getText();
        }
        else if (newLocationType == "Select Location Type")
        {
            newLocationType = "";
        }



        locationCreationText.setText("Will save location to Data Base");

        System.out.println("--ADDING NEW LOCATION");
        System.out.println(newName);
        System.out.println(newDescription);
        System.out.println(newLocationType);
        System.out.println();
    }















    @FXML
    protected void onCharacterSearchButtonClick()
    {
        characterSearchField.setText("Searching Database for Character");

        //first check all the properties to see if any new types need to be added
        //then add the character itself
    }

    @FXML
    protected void onEventSearchButtonClick()
    {
        eventSearchField.setText("Searching Database for Event");

        //first check all the properties to see if any new types need to be added
        //then add the event itself
    }

    @FXML
    protected void onLocationSearchButtonClick()
    {
        locationSearchField.setText("Searching Database for Location");

        //first check all the properties to see if any new types need to be added
        //then add the location itself
    }
}