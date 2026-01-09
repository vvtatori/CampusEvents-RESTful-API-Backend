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
public class Student {
    private String name;
    private String studentId;

    public Student() {
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    } 
}
