package com.Group3.GeekText;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Profiles")
public class Profiles {

    @Id
    @Column(name = "ID")
    public int id;
    @Column(name = "Username")
    public String username;

    @Column(name = "Name")
    public String name;
    @Column(name = "EmailAddress")
    public String emailAddress;
    @Column(name = "HomeAddress")
    public String homeAddress;


    public int getId() {
        return id;
    }
    public void setId(int id) {
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
