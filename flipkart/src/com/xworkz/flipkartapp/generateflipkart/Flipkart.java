package com.xworkz.flipkartapp.generateflipkart;

import com.xworkz.flipkartapp.flipkartdto.FlipkartDto;

public class Flipkart {

    public boolean placeOrder(FlipkartDto dto) {
        boolean orderPlaced = false;
        boolean validated = validateOrder(dto);
        if (validated) {
            orderPlaced = true;
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order validation failed!");
        }
        return orderPlaced;
    }

    public boolean validateOrder(FlipkartDto dto) {

        boolean orderValidated = false;

        boolean nameValid = false;
        boolean emailValid = false;
        boolean addressValid = false;
        boolean contactValid = false;
        boolean productValid = false;
        boolean quantityValid = false;
        boolean priceValid = false;
        boolean paymentValid = false;

        if (dto.getCustomerName() != null && !dto.getCustomerName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Customer Name!");
        }

        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!");
        }

        if (dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            addressValid = true;
        } else {
            System.out.println("Invalid Address!");
        }

        if (dto.getContactNumber() != null && !dto.getContactNumber().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("Invalid Contact Number!");
        }

        if (dto.getProductName() != null && !dto.getProductName().isEmpty()) {
            productValid = true;
        } else {
            System.out.println("Invalid Product Name!");
        }

        if (dto.getQuantity() > 0) {
            quantityValid = true;
        } else {
            System.out.println("Invalid Quantity!");
        }

        if (dto.getPrice() > 0) {
            priceValid = true;
        } else {
            System.out.println("Invalid Price!");
        }

        if (dto.getPaymentMethod() != null) {
            paymentValid = true;
        } else {
            System.out.println("Invalid Payment Method!");
        }

        if (nameValid && emailValid && addressValid && contactValid && productValid &&
                quantityValid && priceValid && paymentValid) {
            orderValidated = true;
        }

        return orderValidated;
    }

}

