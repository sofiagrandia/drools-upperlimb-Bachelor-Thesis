package entities;

import java.util.*;
import java.time.LocalDate;

public class Patient {
    private String userID;
    private String firstName;
    private String lastName;
    private float weight;
    private float height;
    private LocalDate dob;

    public Patient() {
        this.userID = "EmptyPatient";
    }

    public Patient(String userID, String firstName, String lastName, LocalDate dob){
        this();
        this.userID=userID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }


    public Patient(String userID, String firstName, String lastName, float weight, float height, LocalDate dob) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
