package com.xworkz.myntraapp;

import com.xworkz.myntraapp.constants.PaymentMethod;
import com.xworkz.myntraapp.myntradto.MyntraDto;
import com.xworkz.myntraapp.generatemyntra.Myntra;

public class MyntraRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        MyntraDto dto = new MyntraDto();
        dto.setCustomerName("Sahana P");
        dto.setEmail("sahana.myntra@gmail.com");
        dto.setAddress("4th Main, HSR Layout, Bangalore");
        dto.setContactNumber("9876543219");
        dto.setProductName("Cotton Kurti");
        dto.setQuantity(2);
        dto.setPrice(1899.99);
        dto.setPaymentMethod(PaymentMethod.CASH_ON_DELIVERY);

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Address: " + dto.getAddress());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Product: " + dto.getProductName());
        System.out.println("Quantity: " + dto.getQuantity());
        System.out.println("Price: " + dto.getPrice());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("----------------------------------");

        Myntra myntra = new Myntra();
        myntra.placeOrder(dto);
    }
}
