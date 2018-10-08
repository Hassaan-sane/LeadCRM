package com.example.hassaan.leadcrm.TableClasses;

public class EventParticipents {

    public static final String TABLE_NAME = "EventsParticipents";
    public static final String KEY_ID = "ID";
    public static final String KEY_PARTICIPENTSID = "ParticipentsID";
    public static final String KEY_EVENTID = "EventID";

    public Integer ID;
    public Integer ParticipentsID;
    public Integer EventID;

    public EventParticipents(Integer ID, Integer participentsID, Integer eventID) {
        this.ID = ID;
        ParticipentsID = participentsID;
        EventID = eventID;
    }

    public EventParticipents()
    {}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getParticipentsID() {
        return ParticipentsID;
    }

    public void setParticipentsID(Integer participentsID) {
        ParticipentsID = participentsID;
    }

    public Integer getEventID() {
        return EventID;
    }

    public void setEventID(Integer eventID) {
        EventID = eventID;
    }
}
