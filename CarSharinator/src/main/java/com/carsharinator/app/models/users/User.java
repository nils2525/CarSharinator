package com.carsharinator.app.models.users;

import javax.persistence.Entity;
import java.util.Date;

//@Entity
public class User {
    private int _id;
    // unique
    private String _username;

    private String _firstname;
    private String _lastname;
    private String _password;
    private Gender _gender;
    private String _email;
    private boolean _isActive;
    private Date _creationDate;

    public User(int Id,String UserName, String LastName, String Password, Gender Gender, String Email, boolean IsActive, Date CreationDate)
            {
                this._id = Id;
                this._username = UserName;
                this._lastname = LastName;
                this._password = Password;
                this._gender = Gender;
                this._email = Email;
                this._isActive = IsActive;
                this._creationDate = CreationDate;
        
            }
    
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
        return _gender.toString();
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

    public void setGender(Gender _gender) {
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
