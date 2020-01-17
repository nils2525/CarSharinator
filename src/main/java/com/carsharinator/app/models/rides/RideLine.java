package com.carsharinator.app.models.rides;

import java.util.Date;

public class RideLine {

    private int _ridenumber;
    private int _lineNo;
    // unique
    private int _passengerID;

    private String _passengerusername;
    private String _passengerfirstname;
    private String _passengerlastname;
    private String _passengergender;
    private String _passengeremail;
    private Time _pickupTime;
    private String _address;

    public int getId() {
        return _passengerID;
    }

    public String getpassengername() {
        return _passengerusername;
    }

    public String getPassengerFirstname() {
        return _passengerfirstname;
    }

    public String getPassengerLastname() {
        return _passengerlastname;
    }

    public String getPassengerGender() {
        return _passengergender;
    }

    public String getPassengerEmail() {
        return _passengeremail;
    }

    public Date getCreationDate() {
        return _creationDate;
    }

    public Time getpickupTime() {
        return _pickupTime;
    }
    
    public String getaddress(){
        return _address;
    }
   
    public void setPassengerUsername(String _Passengerusername) {
        this._passengerusername = _Passengerusername;
    }

    public void setPassengerFirstname(String _Passengerfirstname) {
        this._passengerfirstname = _Passengerfirstname;
    }

    public void setPassengerLastname(String _Passengerlastname) {
        this._passengerlastname = _Passengerlastname;
    }

    public void setPassengerGender(String _Passengergender) {
        this._passengergender = _Passengergender;
    }

    public void setPassengerEmail(String _Passengeremail) {
        this._passengeremail = _Passengeremail;
    }

    
    public void setPickupTime(Time _pickupTime){
        this._PickupTime = _pickupTime;
    }
    
    public void setPickupAddress(String _pickupAddress){
        this._pickupAddress = _pickupAddress;
    }
    

}
