package com.xworkz.marker.markers;

public class Marker {
    private String markerName;
    private String markerTipType;
    private String markerInkType;
    private int markerCapacity;
    private boolean isRefillable;
    private double markerWeight;

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }
    public String getMarkerName() {
        return markerName;
    }

    public void setMarkerTipType(String markerTipType) {
        this.markerTipType = markerTipType;
    }
    public String getMarkerTipType() {
        return markerTipType;
    }

    public void setMarkerInkType(String markerInkType) {
        this.markerInkType = markerInkType;
    }
    public String getMarkerInkType() {
        return markerInkType;
    }

    public void setMarkerCapacity(int markerCapacity) {
        this.markerCapacity = markerCapacity;
    }
    public int getMarkerCapacity() {
        return markerCapacity;
    }

    public void setRefillable(boolean isRefillable) {
        this.isRefillable = isRefillable;
    }
    public boolean isRefillable() {
        return isRefillable;
    }

    public void setMarkerWeight(double markerWeight) {
        this.markerWeight = markerWeight;
    }
    public double getMarkerWeight() {
        return markerWeight;
    }
}