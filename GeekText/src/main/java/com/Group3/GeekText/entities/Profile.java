package com.Group3.GeekText.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "Profiles")
public class Profile {

    @Id
    @JsonBackReference
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ProfileID", nullable = false)
    private long profileID;


    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "Name")
    private String name;
    @Column(name = "EmailAddress")
    private String emailAddress;
    @Column(name = "HomeAddress")
    private String homeAddress;


    public long getProfileID() {return profileID;}
    public void setProfileID(long profileID) {
        this.profileID = profileID;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
