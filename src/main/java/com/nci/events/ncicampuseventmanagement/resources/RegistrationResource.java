/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nci.events.ncicampuseventmanagement.resources;

import com.nci.events.ncicampuseventmanagement.services.CampusService;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vvtat
 */
@Path("/events/{eventId}/registrations")  //An event has a list of all the registered students 
public class RegistrationResource {
    //creating a new registration
    @POST
    @Path("/{studentId}")
    public  Response register(@PathParam("eventId") String eId, @PathParam("studentId") String sId){
        if ( (!CampusService.events.containsKey(eId)) || (!CampusService.students.containsKey(sId)) ){
            return Response.status(Response.Status.CONFLICT)
                            .entity("Already Registred")
                            .build();
        }
        
        //Creating a new list to hold the registrations
        List<String> attendees = CampusService.registrations.computeIfAbsent(eId, k -> new ArrayList<>());
        if (attendees.contains(sId)){
            return Response.status(Response.Status.CONFLICT)
                            .entity("Already Registered")
                            .build();
        }
        
        attendees.add(sId);
        return Response.status(Response.Status.CREATED).build();
    }
}
