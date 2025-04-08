package com.xworkz.restaurantapp;

import com.xworkz.restaurantapp.constants.PaymentMethod;
import com.xworkz.restaurantapp.restaurantdto.RestaurantOrderDto;
import com.xworkz.restaurantapp.orderprocessing.Restaurant;

public class RestaurantRunner {

    public static void main(String[] args) {
        System.out.println("----------------------------------");

        RestaurantOrderDto dto = new RestaurantOrderDto();
        dto.setCustomerName("Samantha Rao");
        dto.setTableNumber(7);
        dto.setDishName("Paneer Butter Masala");
        dto.setServings(2);
        dto.setTotalAmount(550.00);
        dto.setContactNumber("9876543210");
        dto.setPaymentMethod(PaymentMethod.CARD);

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Table Number: " + dto.getTableNumber());
        System.out.println("Dish Name: " + dto.getDishName());
        System.out.println("Servings: " + dto.getServings());
        System.out.println("Total Amount: " + dto.getTotalAmount());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("----------------------------------");

        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(dto);
    }
}
