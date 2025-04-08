package com.xworkz.tollapp.tolldto;

import com.xworkz.tollapp.constants.VehicleType;
import com.xworkz.tollapp.constants.PaymentMode;

public class TollDto {

    private String vehicleNumber;
    private String driverName;
    private VehicleType vehicleType;
    private double tollAmount;
    private String tollBoothLocation;
    private String date;
    private PaymentMode paymentMode;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setTollAmount(double tollAmount) {
        this.tollAmount = tollAmount;
    }

    public double getTollAmount() {
        return tollAmount;
    }

    public void setTollBoothLocation(String tollBoothLocation) {
        this.tollBoothLocation = tollBoothLocation;
    }

    public String getTollBoothLocation() {
        return tollBoothLocation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
}
