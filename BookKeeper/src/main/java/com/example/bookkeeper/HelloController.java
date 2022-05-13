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


    ObservableList<bkCharacter> bkCharacterList = FXCollections.observableArrayList();
    ObservableList<bkEvent> bkEventList = FXCollections.observableArrayList();
    ObservableList<bkLocation> bkLocationList = FXCollections.observableArrayList();





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
    private TextField characterNameField;

    @FXML
    private TextArea characterDescriptionArea;

    @FXML
    private TextField characterAgeField;

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



    //SEARCH VARIABLES
    @FXML
    private TextField characterSearchField;
    @FXML
    private TextField eventSearchField;
    @FXML
    private TextField locationSearchField;


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


    //CREATE BUTTON FUNCTIONS
    @FXML
    protected void onCreateCharacterButtonClick()
    {
        String newName = characterNameField.getText();
        String newDescription = characterDescriptionArea.getText();
        String newAge = characterAgeField.getText();

        String newGender = String.valueOf(genderChoiceBox.getValue());
        if(newGender == "Other, Please Specify")
        {
            newGender = genderField.getText();

            //Adding new gender to the list
            genderList.add((genderList.size() - 1), newGender);
        }
        else if (newGender == "Select Character's Gender")
        {
            newGender = "";
        }

        String newSexuality = String.valueOf(sexualityChoiceBox.getValue());
        if(newSexuality == "Other, Please Specify")
        {
            newSexuality = sexualityField.getText();

            //Adding new sexuality to the list
            sexualitiesList.add((sexualitiesList.size() - 1), newSexuality);
        }
        else if (newSexuality == "Select Character's Sexuality")
        {
            newSexuality = "";
        }

        String newSpecies = String.valueOf(raceSpeciesChoiceBox.getValue());
        if(newSpecies == "Other, Please Specify")
        {
            newSpecies = raceSpeciesField.getText();

            //Adding new species to the list
            raceSpeciesList.add((raceSpeciesList.size() - 1), newSpecies);
        }
        else if (newSpecies == "Select Character's Species")
        {
            newSpecies = "";
        }

        String newSkinColor = String.valueOf(raceSkinColorChoiceBox.getValue());
        if(newSkinColor == "Other, Please Specify")
        {
            newSkinColor = raceSkinColorField.getText();

            //Adding new skin color to the list
            raceSkinColorList.add((raceSkinColorList.size() - 1), newSkinColor);
        }
        else if (newSkinColor == "Select Character's Skin Color")
        {
            newSkinColor = "";
        }

        String newHairColor = String.valueOf(hairColorChoiceBox.getValue());
        if(newHairColor == "Other, Please Specify")
        {
            newHairColor = hairColorField.getText();

            //Adding new skin color to the list
            hairColorList.add((hairColorList.size() - 1), newHairColor);
        }
        else if (newHairColor == "Select Character's Hair Color")
        {
            newHairColor = "";
        }

        String newEyeColor = String.valueOf(eyeColorChoiceBox.getValue());
        if(newEyeColor == "Other, Please Specify")
        {
            newEyeColor = eyeColorField.getText();

            //Adding new skin color to the list
            eyeColorList.add((eyeColorList.size() - 1), newEyeColor);
        }
        else if (newEyeColor == "Select Character's Eye Color")
        {
            newEyeColor = "";
        }

        characterCreationText.setText("Will save " + newName+ " to Data Base");



        eventCreationText.setText("Will save " + newName + " to Data Base");

        //Add to array
        bkCharacter newCharacter = new bkCharacter(newName,
                                                   newDescription,
                                                   newAge,
                                                   newGender,
                                                   newSexuality,
                                                   newSpecies,
                                                   newSkinColor,
                                                   newHairColor,
                                                   newEyeColor);
        bkCharacterList.add(newCharacter);


        System.out.println("--ADDING NEW CHARACTER");
        System.out.println(newCharacter.getCharacterName());
        System.out.println(newCharacter.getCharacterDescription());
        System.out.println(newCharacter.getCharacterAge());
        System.out.println(newCharacter.getGender());
        System.out.println(newCharacter.getSexuality());
        System.out.println(newCharacter.getSpecies());
        System.out.println(newCharacter.getSkinColor());
        System.out.println(newCharacter.getHairColor());
        System.out.println(newCharacter.getEyeColor());
        System.out.println();

        //SETTING ALL OPTIONS BACK TO CLEAR
        characterNameField.clear();
        characterDescriptionArea.clear();
        characterAgeField.clear();
        genderChoiceBox.setValue("Select Character's Gender");
        genderField.setVisible(false);
        genderField.clear();
        sexualityChoiceBox.setValue("Select Character's Sexuality");
        sexualityField.setVisible(false);
        sexualityField.clear();
        raceSpeciesChoiceBox.setValue("Select Character's Species");
        raceSpeciesField.setVisible(false);
        raceSpeciesField.clear();
        raceSkinColorChoiceBox.setValue("Select Character's Skin Color");
        raceSkinColorField.setVisible(false);
        raceSkinColorField.clear();
        hairColorChoiceBox.setValue("Select Character's Hair Color");
        hairColorField.setVisible(false);
        hairColorField.clear();
        eyeColorChoiceBox.setValue("Select Character's Eye Color");
        eyeColorField.setVisible(false);
        eyeColorField.clear();
    }
    @FXML
    protected void onCreateEventButtonClick()
    {
        String newName = eventNameField.getText();
        String newDescription = eventDescriptionArea.getText();
        String newStart = eventStartDateField.getText();
        String newEnd = eventEndDateField.getText();


        eventCreationText.setText("Will save " + newName + " to Data Base");

        //Add to array
        bkEvent newEvent = new bkEvent(newName, newDescription, newStart, newEnd);
        bkEventList.add(newEvent);


        System.out.println("--ADDING NEW EVENT");
        System.out.println(newEvent.getEventName());
        System.out.println(newEvent.getEventDescription());
        System.out.println(newEvent.getEventStartDate());
        System.out.println(newEvent.getEventEndDate());
        System.out.println();

        //SETTING ALL OPTIONS BACK TO CLEAR
        eventNameField.clear();
        eventDescriptionArea.clear();
        eventStartDateField.clear();
        eventEndDateField.clear();
    }
    @FXML
    protected void onCreateLocationButtonClick()
    {
        String newName = locationNameField.getText();
        String newDescription = locationDescriptionArea.getText();

        String newLocationType = String.valueOf(locationTypeChoiceBox.getValue());
        if(newLocationType == "Other, Please Specify")
        {
            newLocationType = locationTypeField.getText();

            //Adding new location type to the list
            locationTypeList.add((locationTypeList.size() - 1), newLocationType);
        }
        else if (newLocationType == "Select Location Type")
        {
            newLocationType = "NULL";
        }

        locationCreationText.setText("Saving " + newName +" save location to Data Base");

        //Add to array
        bkLocation newLocation = new bkLocation(newName, newDescription, newLocationType);
        bkLocationList.add(newLocation);


        //Printing to Console
        System.out.println("--ADDING NEW LOCATION");
        System.out.println(newLocation.getLocationName());
        System.out.println(newLocation.getLocationDescription());
        System.out.println(newLocation.getLocationType());
        System.out.println();



        //SETTING ALL OPTIONS BACK TO CLEAR
        locationNameField.clear();
        locationDescriptionArea.clear();
        locationTypeChoiceBox.setValue("Select Location Type");
        locationTypeField.setVisible(false);
        locationTypeField.clear();
    }

    //SEARCH BUTTON FUNCTIONS
    @FXML
    protected void onCharacterSearchButtonClick()
    {
        if(bkCharacterList.size() == 0)
        {
            characterSearchText.setText("Character Database is Empty");
            return;
        }
        //ELSE

        String searchCharacterName = characterSearchField.getText();
        characterSearchText.setText("Searching Database for " + searchCharacterName);

        int index = 0;
        while(index < bkCharacterList.size())
        {
            if(searchCharacterName.equalsIgnoreCase(bkCharacterList.get(index).getCharacterName()))
            {
                characterSearchText.setText(searchCharacterName + " found!");
                return;
            }
            index++;
        }

        //CHARACTER NOT FOUND
        characterSearchText.setText(searchCharacterName + " not found!");
    }
    @FXML
    protected void onEventSearchButtonClick()
    {
        if(bkEventList.size() == 0)
        {
            eventSearchText.setText("Event Database is Empty");
            return;
        }
        //ELSE

        String searchEventName = eventSearchField.getText();
        eventSearchText.setText("Searching Database for " + searchEventName);

        int index = 0;
        while(index < bkEventList.size())
        {
            if(searchEventName.equalsIgnoreCase(bkEventList.get(index).getEventName()))
            {
                eventSearchText.setText(searchEventName + " found!");
                return;
            }
            index++;
        }

        //EVENT NOT FOUND
        eventSearchText.setText(searchEventName + " not found!");
    }
    @FXML
    protected void onLocationSearchButtonClick()
    {
        if(bkLocationList.size() == 0)
        {
            locationSearchText.setText("Location Database is Empty");
            return;
        }
        //ELSE

        String searchLocationName = locationSearchField.getText();
        locationSearchText.setText("Searching Database for " + searchLocationName);

        int index = 0;
        while(index < bkLocationList.size())
        {
            if(searchLocationName.equalsIgnoreCase(bkLocationList.get(index).getLocationName()))
            {
                locationSearchText.setText(searchLocationName + " found!");
                return;
            }
            index++;
        }

        //CHARACTER NOT FOUND
        locationSearchText.setText(searchLocationName + " not found!");
    }
}