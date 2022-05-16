package com.example.bookkeeper;

import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.WindowEvent;
import javafx.scene.image.Image;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//import java.sql.Connection;
//import java.sql.DriverManager;


public class HelloController<JFXTabPane>
{
//    Connection connection = DriverManager.getConnection();

    ObservableList<String> genderList;
    ObservableList<String> sexualitiesList;
    ObservableList<String> raceSpeciesList;
    ObservableList<String> raceSkinColorList;
    ObservableList<String> hairColorList;
    ObservableList<String> eyeColorList;
    ObservableList<String> locationTypeList;

    ObservableList<BKCharacter> bkCharacterList;
    ObservableList<BKEvent> bkEventList;
    ObservableList<BKLocation> bkLocationList;

    //REFERSHING DATA
//    ObservableList<String> genderList = FXCollections.observableArrayList("Select Character's Gender",
//                                                                               "Male",
//                                                                               "Female",
//                                                                               "Non-binary",
//                                                                               "Gender Fluid",
//                                                                               "Other, Please Specify");
//    ObservableList<String> sexualitiesList = FXCollections.observableArrayList("Select Character's Sexuality",
//                                                                                    "Heterosexual",
//                                                                                    "Homosexual",
//                                                                                    "Bisexual",
//                                                                                    "Pansexual",
//                                                                                    "Asexual",
//                                                                                    "Other, Please Specify");
//    ObservableList<String> raceSpeciesList = FXCollections.observableArrayList("Select Character's Species",
//                                                                                    "Human",
//                                                                                    "Elf",
//                                                                                    "Dwarf",
//                                                                                    "Halfling",
//                                                                                    "Other, Please Specify");
//    ObservableList<String> raceSkinColorList = FXCollections.observableArrayList("Select Character's Skin Color",
//                                                                                     "White",
//                                                                                     "Black",
//                                                                                     "Native American",
//                                                                                     "Indian",
//                                                                                     "Chinese",
//                                                                                     "Filipino",
//                                                                                     "Japanese",
//                                                                                     "Korean",
//                                                                                     "Native Hawaiian",
//                                                                                     "Guamanian",
//                                                                                     "Chamorro",
//                                                                                     "Samoan",
//                                                                                     "Other, Please Specify");
//    ObservableList<String> hairColorList = FXCollections.observableArrayList("Select Character's Hair Color",
//                                                                                 "Bald/No Hair",
//                                                                                 "Redhead/Ginger",
//                                                                                 "Blonde",
//                                                                                 "Brunette",
//                                                                                 "Black",
//                                                                                 "White",
//                                                                                 "Grey",
//                                                                                 "Pink",
//                                                                                 "Red",
//                                                                                 "Orange",
//                                                                                 "Yellow",
//                                                                                 "Blue",
//                                                                                 "Green",
//                                                                                 "Purple",
//                                                                                 "Other, Please Specify");
//    ObservableList<String> eyeColorList = FXCollections.observableArrayList("Select Character's Eye Color",
//                                                                                "Amber",
//                                                                                "Blue",
//                                                                                "Brown",
//                                                                                "Grey",
//                                                                                "Green",
//                                                                                "Hazel",
//                                                                                "Red",
//                                                                                "Black",
//                                                                                "Purple",
//                                                                                "Other, Please Specify");
//    ObservableList<String> locationTypeList = FXCollections.observableArrayList("Select Location Type",
//                                                                                "Room",
//                                                                                "Building",
//                                                                                "Park",
//                                                                                "Street",
//                                                                                "Neighborhood",
//                                                                                "Village",
//                                                                                "Town",
//                                                                                "City",
//                                                                                "County",
//                                                                                "State",
//                                                                                "Province",
//                                                                                "Territory",
//                                                                                "Country",
//                                                                                "Island",
//                                                                                "Continent",
//                                                                                "Moon",
//                                                                                "Planet",
//                                                                                "Solar System",
//                                                                                "Galaxy",
//                                                                                "Universe",
//                                                                                "Other, Please Specify");
//
//    ObservableList<BKCharacter> bkCharacterList = FXCollections.observableArrayList();
//    ObservableList<BKEvent> bkEventList = FXCollections.observableArrayList();
//    ObservableList<BKLocation> bkLocationList = FXCollections.observableArrayList();


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

    @FXML
    private Label characterFoundOutputText;
    @FXML
    private Label eventFoundOutputText;
    @FXML
    private Label locationFoundOutputText;

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


    //LOCATION CREATION DATA
    @FXML
    private TextField locationNameField;
    @FXML
    private TextArea locationDescriptionArea;
    @FXML
    private ChoiceBox locationTypeChoiceBox;
    @FXML
    private TextField locationTypeField;

    //SAVE DATABASES FEATURE
    @FXML
    private Button saveDataBasesButton;
    @FXML
    private Label savedMessage1;
    @FXML
    private Label savedMessage2;
    @FXML
    private Label savedMessage3;



    //SEARCH VARIABLES
    @FXML
    private TextField characterSearchField;
    @FXML
    private TextField eventSearchField;
    @FXML
    private TextField locationSearchField;


    /*********************************************************************************************
     *                                       * FUNCTIONS *                                       *
     *********************************************************************************************/
    @FXML
    private void initialize()
    {
        //Initializing observable lists
        genderList = readObservableListFromFile(FileSystems.getDefault().getPath("Genders.bin"));
        sexualitiesList = readObservableListFromFile(FileSystems.getDefault().getPath("Sexualities.bin"));
        raceSpeciesList = readObservableListFromFile(FileSystems.getDefault().getPath("Species.bin"));
        raceSkinColorList = readObservableListFromFile(FileSystems.getDefault().getPath("SkinColor.bin"));
        hairColorList = readObservableListFromFile(FileSystems.getDefault().getPath("HairColor.bin"));
        eyeColorList = readObservableListFromFile(FileSystems.getDefault().getPath("EyeColor.bin"));
        locationTypeList = readObservableListFromFile(FileSystems.getDefault().getPath("LocationTypes.bin"));
        //bkTypes
        bkCharacterList = readObservableListFromFile(FileSystems.getDefault().getPath("BKCharacters.bin"));
        bkEventList = readObservableListFromFile(FileSystems.getDefault().getPath("BKEvents.bin"));
        bkLocationList = readObservableListFromFile(FileSystems.getDefault().getPath("BKLocations.bin"));



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
        //showing text box if new item needs to be added
        if(genderChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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
        //showing text box if new item needs to be added
        if(sexualityChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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
//        Object newSpecies = raceSpeciesChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(raceSpeciesChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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
//        Object newSkinColor = raceSkinColorChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(raceSkinColorChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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
//        Object newHairColor = hairColorChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(hairColorChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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
//        Object newEyeColor = eyeColorChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(eyeColorChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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
//        Object newLocationType = locationTypeChoiceBox.getValue();

        //showing text box if new item needs to be added
        if(locationTypeChoiceBox.getValue().toString().equalsIgnoreCase("Other, Please Specify"))
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

        String newGender = String.valueOf(genderChoiceBox.getValue().toString());
        if(newGender.equalsIgnoreCase("Other, Please Specify"))
        {
            newGender = genderField.getText();

            //Adding new gender to the list
            genderList.add((genderList.size() - 1), newGender);
        }
        else if (newGender.equalsIgnoreCase("Select Character's Gender"))
        {
            newGender = "";
        }

        String newSexuality = String.valueOf(sexualityChoiceBox.getValue().toString());
        if(newSexuality.equalsIgnoreCase("Other, Please Specify"))
        {
            newSexuality = sexualityField.getText();

            //Adding new sexuality to the list
            sexualitiesList.add((sexualitiesList.size() - 1), newSexuality);
        }
        else if (newSexuality.equalsIgnoreCase("Select Character's Sexuality"))
        {
            newSexuality = "";
        }

        String newSpecies = String.valueOf(raceSpeciesChoiceBox.getValue().toString());
        if(newSpecies.equalsIgnoreCase("Other, Please Specify"))
        {
            newSpecies = raceSpeciesField.getText();

            //Adding new species to the list
            raceSpeciesList.add((raceSpeciesList.size() - 1), newSpecies);
        }
        else if (newSpecies.equalsIgnoreCase("Select Character's Species"))
        {
            newSpecies = "";
        }

        String newSkinColor = String.valueOf(raceSkinColorChoiceBox.getValue().toString());
        if(newSkinColor.equalsIgnoreCase("Other, Please Specify"))
        {
            newSkinColor = raceSkinColorField.getText();

            //Adding new skin color to the list
            raceSkinColorList.add((raceSkinColorList.size() - 1), newSkinColor);
        }
        else if (newSkinColor.equalsIgnoreCase("Select Character's Skin Color"))
        {
            newSkinColor = "";
        }

        String newHairColor = String.valueOf(hairColorChoiceBox.getValue().toString());
        if(newHairColor.equalsIgnoreCase("Other, Please Specify"))
        {
            newHairColor = hairColorField.getText();

            //Adding new skin color to the list
            hairColorList.add((hairColorList.size() - 1), newHairColor);
        }
        else if (newHairColor.equalsIgnoreCase("Select Character's Hair Color"))
        {
            newHairColor = "";
        }

        String newEyeColor = String.valueOf(eyeColorChoiceBox.getValue().toString());
        if(newEyeColor.equalsIgnoreCase("Other, Please Specify"))
        {
            newEyeColor = eyeColorField.getText();

            //Adding new skin color to the list
            eyeColorList.add((eyeColorList.size() - 1), newEyeColor);
        }
        else if (newEyeColor.equalsIgnoreCase("Select Character's Eye Color"))
        {
            newEyeColor = "";
        }

        characterCreationText.setText("Saving " + newName + " to Data Base");


        //Add to array
        BKCharacter newCharacter = new BKCharacter(newName,
                                                   newDescription,
                                                   newAge,
                                                   newGender,
                                                   newSexuality,
                                                   newSpecies,
                                                   newSkinColor,
                                                   newHairColor,
                                                   newEyeColor);
        bkCharacterList.add(newCharacter);


        //PRINTING TO CONSOLE
        System.out.println("--ADDING NEW CHARACTER");
        System.out.println(newCharacter.toString());
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


        eventCreationText.setText("Saving " + newName + " to Data Base");

        //Add to array
        BKEvent newEvent = new BKEvent(newName, newDescription, newStart, newEnd);
        bkEventList.add(newEvent);


        System.out.println("--ADDING NEW EVENT");
        System.out.println(newEvent.toString());
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

        String newLocationType = String.valueOf(locationTypeChoiceBox.getValue().toString());
        if(newLocationType.equalsIgnoreCase("Other, Please Specify"))
        {
            newLocationType = locationTypeField.getText();

            //Adding new location type to the list
            locationTypeList.add((locationTypeList.size() - 1), newLocationType);
        }
        else if (newLocationType.equalsIgnoreCase("Select Location Type"))
        {
            newLocationType = "";
        }

        locationCreationText.setText("Saving " + newName +" to Data Base");

        //Add to array
        BKLocation newLocation = new BKLocation(newName, newDescription, newLocationType);
        bkLocationList.add(newLocation);


        //Printing to Console
        System.out.println("--ADDING NEW LOCATION");
        System.out.println(newLocation.toString());
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
                characterFoundOutputText.setText(bkCharacterList.get(index).toString());
                return;
            }
            index++;
        }

        //CHARACTER NOT FOUND
        characterSearchText.setText(searchCharacterName + " not found!");
        characterFoundOutputText.setText("");
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
                eventFoundOutputText.setText(bkEventList.get(index).toString());
                return;
            }
            index++;
        }

        //EVENT NOT FOUND
        eventSearchText.setText(searchEventName + " not found!");
        eventFoundOutputText.setText("");
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
                locationFoundOutputText.setText(bkLocationList.get(index).toString());
                return;
            }
            index++;
        }

        //CHARACTER NOT FOUND
        locationSearchText.setText(searchLocationName + " not found!");
        locationFoundOutputText.setText("");
    }


    @FXML
    protected void onSaveDataBasesButton() throws IOException {
        //writing all databases to files
        System.out.println("SAVING\n\n");

        //WRITING ATTRIBUTE LISTS TO FILES
        //Character attributes
        writeObservableListToFile(genderList, "Genders.bin");
        writeObservableListToFile(sexualitiesList, "Sexualities.bin");
        writeObservableListToFile(raceSpeciesList, "Species.bin");
        writeObservableListToFile(raceSkinColorList, "SkinColor.bin");
        writeObservableListToFile(hairColorList, "HairColor.bin");
        writeObservableListToFile(eyeColorList, "EyeColor.bin");
        //Location attributes
        writeObservableListToFile(locationTypeList, "LocationTypes.bin");

        //WRITING BK LISTS TO FILES
        writeObservableListToFile(bkCharacterList, "BKCharacters.bin");
        writeObservableListToFile(bkEventList, "BKEvents.bin");
        writeObservableListToFile(bkLocationList, "BKLocations.bin");

        savedMessage1.setText("All databases have been saved");
        savedMessage2.setText("All databases have been saved");
        savedMessage3.setText("All databases have been saved");
    }


    public static void writeObservableListToFile(ObservableList listToWrite, String fileName) throws IOException
    {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(new ArrayList<String>(listToWrite));
        out.close();
    }

    private static ObservableList readObservableListFromFile(Path fileName)
    {
        try
        {
            InputStream in = Files.newInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(in);
            List list = (List) ois.readObject() ;

            return FXCollections.observableList(list);
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return FXCollections.emptyObservableList();
    }
}