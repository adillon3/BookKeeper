package com.example.bookkeeper;

import java.io.Serializable;

public class BKEvent implements Serializable {

    private String eventName;
    private String eventDescription;
    private String eventStartDate;
    private String eventEndDate;

    //CONSTRUCTORS
    public BKEvent(String newEventName)
    {
        this(newEventName, "NULL", "NULL", "NULL");
    }

    public BKEvent(String newEventName, String newEventDescription, String newEventStartDate, String newEventEndDate)
    {
        setEventName(newEventName);
        setEventDescription(newEventDescription);
        setEventStartDate(newEventStartDate);
        setEventEndDate(newEventEndDate);
    }



    //GETTERS AND SETTERS
    public String getEventName()
    {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    public String getEventStartDate() {
        return eventStartDate;
    }
    public void setEventStartDate(String eventStartDate) {
        this.eventStartDate = eventStartDate;
    }
    public String getEventEndDate() {
        return eventEndDate;
    }
    public void setEventEndDate(String eventEndDate) {
        this.eventEndDate = eventEndDate;
    }



    //OTHER METHODS
    public String toString()
    {
        return  "Event Name  : " + eventName + "\n" +
                "Description : " + eventDescription + "\n" +
                "Start Date  : " + eventStartDate + "\n" +
                "End Date    : " + eventEndDate + "\n";

    }
}
