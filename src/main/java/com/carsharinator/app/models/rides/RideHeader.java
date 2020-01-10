package com.carsharinator.app.models.rides.rideheader;

public class RideHeader {
    private int number;
    // unique
    private int userID;
    
    private String _firstname;
    private String _lastname;
    private String _password;
    private String _gender;
    private String _email;

    public int getId() {
        return _id;
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
