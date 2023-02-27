package com.Group3.GeekText.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "Profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    @Column(name = "ProfileID")
    private Long id;
    @Column(name = "Username")
    public String username;

    @Column(name = "Name")
    public String name;
    @Column(name = "EmailAddress")
    public String emailAddress;
    @Column(name = "HomeAddress")
    public String homeAddress;


    public long getProfileID() {
    return id;
}
    public void setProfileID(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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
