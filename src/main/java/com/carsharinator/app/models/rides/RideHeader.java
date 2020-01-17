package com.carsharinator.app.models.rides;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RideHeader {
    @Id
    @GeneratedValue
    private int _number;
    // unique
    private int _userID;
    
    private String _username;
    private String _firstname;
    private String _lastname;
    private String _password;
    private String _gender;
    private String _email;
    private Boolean _isActive;
    private Date _creationDate;

    public int getId() {
        return _userID;
    }

    public String getUsername() {
        return _username;
    }

    public String getFirstname() {
        return _firstname;
    }

    public String getLastname() {
        return _lastname;
    }

    public String getPassword() {
        return _password;
    }

    public String getGender() {
        return _gender;
    }

    public String getEmail() {
        return _email;
    }

    public boolean isIsActive() {
        return _isActive;
    }

    public Date getCreationDate() {
        return _creationDate;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }

    public void setFirstname(String _firstname) {
        this._firstname = _firstname;
    }

    public void setLastname(String _lastname) {
        this._lastname = _lastname;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public void setGender(String _gender) {
        this._gender = _gender;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setIsActive(boolean _isActive) {
        this._isActive = _isActive;
    }

    public void setCreationDate(Date _creationDate) {
        this._creationDate = _creationDate;
    }
    
    
    
        
}
