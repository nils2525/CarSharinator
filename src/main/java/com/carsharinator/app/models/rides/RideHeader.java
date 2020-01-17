package com.carsharinator.app.models.rides;

import java.util.Date;

public class RideHeader {

    private int _number;
    // unique
    private int _driverID;

    private String _driverusername;
    private String _driverfirstname;
    private String _driverlastname;
    private String _drivergender;
    private String _driveremail;
    private Date _creationDate;
    private Time _startTime;
    private Time _endTime;
    private String _startAddress;
    private String _destinationAddress;

    public int getId() {
        return _driverID;
    }

    public String getdrivername() {
        return _driverusername;
    }

    public String getdriverFirstname() {
        return _driverfirstname;
    }

    public String getdriverLastname() {
        return _driverlastname;
    }

    public String getDriverGender() {
        return _drivergender;
    }

    public String getDriverEmail() {
        return _driveremail;
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

    public void setDriverUsername(String _driverusername) {
        this._driverusername = _driverusername;
    }

    public void setDriverFirstname(String _driverfirstname) {
        this._driverfirstname = _driverfirstname;
    }

    public void setDriverLastname(String _driverlastname) {
        this._driverlastname = _driverlastname;
    }

    public void setDriverGender(String _drivergender) {
        this._drivergender = _drivergender;
    }

    public void setDriverEmail(String _driveremail) {
        this._driveremail = _driveremail;
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
