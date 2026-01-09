/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nci.events.ncicampuseventmanagement.resources;

import com.nci.events.ncicampuseventmanagement.models.Event;
import com.nci.events.ncicampuseventmanagement.services.CampusService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author vvtat
 */
@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {
    //to get all events
    @GET
    public List<Event> getEvents(@QueryParam("category") String category){
        List<Event> allEvents = new ArrayList<>(CampusService.events.values());
        if (category == null) return allEvents;
        
        return allEvents.stream()
                        .filter(e -> e.getCategory().equalsIgnoreCase(category))
                        .collect(Collectors.toList());
    }
}
