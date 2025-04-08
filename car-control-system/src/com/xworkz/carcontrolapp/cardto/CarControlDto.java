package com.xworkz.carcontrolapp.cardto;

import com.xworkz.carcontrolapp.constants.ControlMode;

public class CarControlDto {

    private String carModel;
    private String licensePlate;
    private String ownerName;
    private String contactNumber;
    private boolean engineStatus;
    private double fuelLevel;
    private double speed;
    private ControlMode controlMode;

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setControlMode(ControlMode controlMode) {
        this.controlMode = controlMode;
    }

    public ControlMode getControlMode() {
        return controlMode;
    }
}
