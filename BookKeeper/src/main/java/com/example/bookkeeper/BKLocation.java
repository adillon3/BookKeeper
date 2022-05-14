package com.example.bookkeeper;

public class BKLocation  {
    private String locationName;
    private String locationDescription;
    private String locationType;

    //CONSTRUCTORS
    public BKLocation(String newLocationName)
    {
        this(newLocationName, "NULL", "NULL");
    }
    public BKLocation(String newLocationName, String newLocationDescription, String newLocationType)
    {
        setLocationName(newLocationName);
        setLocationDescription(newLocationDescription);
        setLocationType(newLocationType);
    }

    //GETTERS AND SETTERS
    public String getLocationName() {
        return locationName;
    }
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    public String getLocationDescription() {
        return locationDescription;
    }
    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }
    public String getLocationType() {
        return locationType;
    }
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    //OTHER METHODS
    public String toString()
    {
        return  "Location Name: " + locationName + "\n" +
                "Description  : " + locationDescription + "\n" +
                "Location Type: " + locationType;
    }


}
