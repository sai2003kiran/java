package com.xworkz.marker;
import com.xworkz.marker.markers.Marker;

public class MarkerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Marker marker1 = new Marker();
        marker1.setMarkerName("Sharpie");
        marker1.setMarkerTipType("Fine Tip");
        marker1.setMarkerInkType("Permanent Ink");
        marker1.setMarkerCapacity(10);
        marker1.setRefillable(false);
        marker1.setMarkerWeight(15.5);
        System.out.println("Marker Name: " + marker1.getMarkerName());
        System.out.println("Marker Tip Type: " + marker1.getMarkerTipType());
        System.out.println("Marker Ink Type: " + marker1.getMarkerInkType());
        System.out.println("Marker Capacity: " + marker1.getMarkerCapacity() + "ml");
        System.out.println("Refillable: " + marker1.isRefillable());
        System.out.println("Marker Weight: " + marker1.getMarkerWeight() + "g");
        System.out.println("*******Complete*********");

        Marker marker2 = new Marker();
        marker2.setMarkerName("Camlin");
        marker2.setMarkerTipType("Chisel Tip");
        marker2.setMarkerInkType("Whiteboard Ink");
        marker2.setMarkerCapacity(15);
        marker2.setRefillable(true);
        marker2.setMarkerWeight(20.0);
        System.out.println("Marker Name: " + marker2.getMarkerName());
        System.out.println("Marker Tip Type: " + marker2.getMarkerTipType());
        System.out.println("Marker Ink Type: " + marker2.getMarkerInkType());
        System.out.println("Marker Capacity: " + marker2.getMarkerCapacity() + "ml");
        System.out.println("Refillable: " + marker2.isRefillable());
        System.out.println("Marker Weight: " + marker2.getMarkerWeight() + "g");
        System.out.println("*******Complete*********");

        Marker marker3 = new Marker();
        marker3.setMarkerName("Stabilo");
        marker3.setMarkerTipType("Bullet Tip");
        marker3.setMarkerInkType("Highlighter Ink");
        marker3.setMarkerCapacity(8);
        marker3.setRefillable(true);
        marker3.setMarkerWeight(18.2);
        System.out.println("Marker Name: " + marker3.getMarkerName());
        System.out.println("Marker Tip Type: " + marker3.getMarkerTipType());
        System.out.println("Marker Ink Type: " + marker3.getMarkerInkType());
        System.out.println("Marker Capacity: " + marker3.getMarkerCapacity() + "ml");
        System.out.println("Refillable: " + marker3.isRefillable());
        System.out.println("Marker Weight: " + marker3.getMarkerWeight() + "g");
        System.out.println("*******Complete*********");

        Marker marker4 = new Marker();
        marker4.setMarkerName("Luxor");
        marker4.setMarkerTipType("Round Tip");
        marker4.setMarkerInkType("Gel Ink");
        marker4.setMarkerCapacity(12);
        marker4.setRefillable(false);
        marker4.setMarkerWeight(22.0);
        System.out.println("Marker Name: " + marker4.getMarkerName());
        System.out.println("Marker Tip Type: " + marker4.getMarkerTipType());
        System.out.println("Marker Ink Type: " + marker4.getMarkerInkType());
        System.out.println("Marker Capacity: " + marker4.getMarkerCapacity() + "ml");
        System.out.println("Refillable: " + marker4.isRefillable());
        System.out.println("Marker Weight: " + marker4.getMarkerWeight() + "g");
        System.out.println("*******Complete*********");

        Marker marker5 = new Marker();
        marker5.setMarkerName("Reynolds");
        marker5.setMarkerTipType("Flat Tip");
        marker5.setMarkerInkType("Metallic Ink");
        marker5.setMarkerCapacity(20);
        marker5.setRefillable(true);
        marker5.setMarkerWeight(25.4);
        System.out.println("Marker Name: " + marker5.getMarkerName());
        System.out.println("Marker Tip Type: " + marker5.getMarkerTipType());
        System.out.println("Marker Ink Type: " + marker5.getMarkerInkType());
        System.out.println("Marker Capacity: " + marker5.getMarkerCapacity() + "ml");
        System.out.println("Refillable: " + marker5.isRefillable());
        System.out.println("Marker Weight: " + marker5.getMarkerWeight() + "g");
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");
    }
}