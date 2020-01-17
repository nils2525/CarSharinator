package com.carsharinator.app.models.rides;

import java.util.Date;

public class RideLine {

    private int _rideNumber;
    private int _lineNo;
    // unique
    private int _passengerID;

    private String _passengerusername;
    private String _passengerfirstname;
    private String _passengerlastname;
    private String _passengergender;
    private String _passengeremail;
    private Date _creationDate;
    private Time _startTime;
    private Time _endTime;
    private String _startAddress;
    private String _destinationAddress;

    public int getId() {
        return _passengerID;
    }

    public String getpassengername() {
        return _passengerusername;
    }

    public String getpassengerFirstname() {
        return _passengerfirstname;
    }

    public String getpassengerLastname() {
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

    public Time getstartTime() {
        return _startTime;
    }

    public Time getendTime() {
        return _endTime;
    }
    
    public String getStartAddress(){
        return _startAddress;
    }
    
    public String getDestinationAddress(){
        return _destinationAddress;
    }

    public void setPassengerUsername(String _passengerusername) {
        this._passengerusername = _passengerusername;
    }

    public void setPassengerFirstname(String _passengerfirstname) {
        this._passengerfirstname = _passengerfirstname;
    }

    public void setPassengerLastname(String _passengerlastname) {
        this._passengerlastname = _passengerlastname;
    }

    public void setPassengerGender(String _passengergender) {
        this._passengergender = _passengergender;
    }

    public void setPassengerEmail(String _passengeremail) {
        this._passengeremail = _passengeremail;
    }

    public void setCreationDate(Date _creationDate) {
        this._creationDate = _creationDate;
    }
    
    public void SetStartTime(Time _startTime){
        this._startTime = _startTime;
    }
    
    public void SetEndTime(Time _endTime){
        this._endTime = endTime;
    }
    
    public void SetStartAddress(String _startAddress){
        this._startAddress = _startAddress;
    }
    
    public void  SetDestinationAddress(String _destinationAddress){
        this._destinationAddress = _destinationAddress;
    }

}
