package com.xworkz.amazon;
import com.xworkz.amazon.fixed.Gender;
import com.xworkz.amazon.data.AmazonDtoValidation;
import com.xworkz.amazon.encapsule.AmazonDataCapturing;
import com.xworkz.amazon.fixed.Gender;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonDtoValidation fetch = new AmazonDtoValidation();
        fetch.setFristName("Saikiran");
        fetch.setLastName("M");
        fetch.setGender(Gender.male);
        fetch.setPhoneNumber("9538547463");
        fetch.setEmail("saik03414@gmail.com");
        fetch.setPassword("456829384dassugryt");

        AmazonDataCapturing get = new AmazonDataCapturing();
        get.userRegisteration(fetch);
        get.displayDetails();
    }
}
