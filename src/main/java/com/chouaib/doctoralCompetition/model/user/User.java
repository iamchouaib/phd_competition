package com.chouaib.doctoralCompetition.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String LastName;
    private String userName;
    
    @Email
    private String email;
    
   
    private String password;

    private LocalDate birthDate;

    public User(int id, String firstName, String lastName, String userName, String email, String password, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.userName = userName;

        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
