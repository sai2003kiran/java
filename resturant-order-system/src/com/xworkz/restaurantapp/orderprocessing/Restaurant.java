package com.xworkz.restaurantapp.orderprocessing;

import com.xworkz.restaurantapp.restaurantdto.RestaurantOrderDto;

public class Restaurant {

    public boolean placeOrder(RestaurantOrderDto dto) {
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

    public boolean validateOrder(RestaurantOrderDto dto) {
        boolean isValid = true;

        if (dto.getCustomerName() == null || dto.getCustomerName().isEmpty()) {
            System.out.println("Invalid Customer Name!");
            isValid = false;
        }

        if (dto.getTableNumber() <= 0) {
            System.out.println("Invalid Table Number!");
            isValid = false;
        }

        if (dto.getDishName() == null || dto.getDishName().isEmpty()) {
            System.out.println("Invalid Dish Name!");
            isValid = false;
        }

        if (dto.getServings() <= 0) {
            System.out.println("Invalid Number of Servings!");
            isValid = false;
        }

        if (dto.getTotalAmount() <= 0) {
            System.out.println("Invalid Total Amount!");
            isValid = false;
        }

        if (dto.getContactNumber() == null || dto.getContactNumber().isEmpty()) {
            System.out.println("Invalid Contact Number!");
            isValid = false;
        }

        if (dto.getPaymentMethod() == null) {
            System.out.println("Invalid Payment Method!");
            isValid = false;
        }

        return isValid;
    }
}
