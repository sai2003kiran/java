package com.xworkz.zomato;
import com.xworkz.zomato.constants.Gender;
import com.xworkz.zomato.encaplatedDto.ZomatoDto;
import com.xworkz.zomato.generator.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        ZomatoDto zomatoDto = new ZomatoDto();
        zomatoDto.setUserName("babafood123");
        zomatoDto.setEmail("babaie@example.com");
        zomatoDto.setPassword("delicious123");
        zomatoDto.setPhoneNumber("9876543210");
        zomatoDto.setGender(Gender.Male);

        Zomato zomato = new Zomato();
        zomato.registerUser(zomatoDto);
    }
}

