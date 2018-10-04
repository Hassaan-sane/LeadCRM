package com.example.hassaan.leadcrm.TableClasses;

public class EventParticipents {

    public static final String TABLE_NAME = "EventsParticipents";
    public static final String KEY_ID = "ID";
    public static final String KEY_PARTICIPENTSID = "ParticipentsID";
    public static final String KEY_EVENTID = "EventID";

    public String ID;
    public String ParticipentsID;
    public String EventID;

    public EventParticipents(String ID, String participentsID, String eventID) {
        this.ID = ID;
        ParticipentsID = participentsID;
        EventID = eventID;
    }

    public EventParticipents()
    {}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getParticipentsID() {
        return ParticipentsID;
    }

    public void setParticipentsID(String participentsID) {
        ParticipentsID = participentsID;
    }

    public String getEventID() {
        return EventID;
    }

    public void setEventID(String eventID) {
        EventID = eventID;
    }
}
