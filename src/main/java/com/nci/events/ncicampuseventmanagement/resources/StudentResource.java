/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nci.events.ncicampuseventmanagement.resources;

import com.nci.events.ncicampuseventmanagement.models.Student;
import com.nci.events.ncicampuseventmanagement.services.CampusService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vvtat
 */
@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {
    //To gte list of all students
    @GET
    public List<Student> getAll(){
        List<Student> allStudents = new ArrayList<>(CampusService.students.values());
        return allStudents;
    }
    
    //To create a new student (POST)
    @POST
    public Response addStudent(Student s){
        if(CampusService.students.containsKey(s.getStudentId())){
            return Response.status(Response.Status.CONFLICT)
                            .entity("Student Exists")
                            .build();
        }
        CampusService.students.put(s.getStudentId(), s);
        return Response.status(Response.Status.CREATED)
                        .entity(s)
                        .build();
    }
    
    //To delete a student(uses the studentId to get the student details)
    @DELETE
    @Path("/{studentId}")
    public Response deleteStudent(@PathParam("studentId") String id){
        if(CampusService.students.remove(id) == null){
            return Response.status(Response.Status.NOT_FOUND)
                            .build();
        }
        CampusService.registrations.values().forEach(list -> list.remove(id)); //deleted each registration in the registrations list from this ID
        return Response.ok().build();
    }
    
}
