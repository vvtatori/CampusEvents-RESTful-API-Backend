/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nci.events.ncicampuseventmanagement.services;

import com.nci.events.ncicampuseventmanagement.models.Event;
import com.nci.events.ncicampuseventmanagement.models.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vvtat
 */
public class CampusService {
    public static Map<String, Student> students = new HashMap<>();
    public static Map<String, Event> events = new HashMap<>();
    
    public static Map<String, List<String>> registrations = new HashMap<>();
    
    static{
        students.put("S1", new Student("S1", "John Joe"));
        events.put("E1", new Event("E1", "Java workshop", "Intro to Java Principles", "12/01/2026", "Mayor Square, lab 303", "Workshop"));
    }
}
