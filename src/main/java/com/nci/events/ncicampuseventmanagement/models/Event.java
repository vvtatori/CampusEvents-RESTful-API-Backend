/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nci.events.ncicampuseventmanagement.models;

import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vvtat
 */
@XmlRootElement
public class Event {
    //eventId, a title, a description, a date, a location, and a category 
    private String eventId;
    private String title;
    private String desc;
    private String date;
    private String location;
    private String category;
    
    //Empty constructor
    public Event() {
    }

    //overloaded constructor
    public Event(String eventId, String title, String desc, String date, String location, String category) {
        this.eventId = eventId;
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.location = location;
        this.category = category;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
