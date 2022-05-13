package com.example.bookkeeper;

import java.io.Serializable;

public class bkCharacter implements Serializable
{
    private String characterName;
    private String characterDescription;
    private String characterAge;
    private String gender;
    private String sexuality;
    private String hairColor;
    private String eyeColor;
    private String skinColor;
    private String species;


    //CONSTRUCTORS
    public bkCharacter(String newCharacterName)
    {
        this(newCharacterName,
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL",
                "NULL");
    }
    public bkCharacter(String newCharacterName,
                       String newCharacterDescription,
                       String newCharacterAge,
                       String newGender,
                       String newSexuality,
                       String newSpecies,
                       String newSkinColor,
                       String newHairColor,
                       String newEyeColor
                       )
    {
        setCharacterName(newCharacterName);
        setCharacterDescription(newCharacterDescription);
        setCharacterAge(newCharacterAge);
        setGender(newGender);
        setSexuality(newSexuality);
        setSpecies(newSpecies);
        setSkinColor(newSkinColor);
        setHairColor(newHairColor);
        setEyeColor(newEyeColor);
    }

    //GETTERS AND SETTERS
    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public String getCharacterDescription() {
        return characterDescription;
    }
    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }
    public String getCharacterAge() {
        return characterAge;
    }
    public void setCharacterAge(String characterAge) {
        this.characterAge = characterAge;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getSexuality() {
        return sexuality;
    }
    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getSkinColor() {
        return skinColor;
    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String speices) {
        this.species = speices;
    }



    //OTHER METHODS




}
