package com.xworkz.movie;

import com.xworkz.movie.dto.UserDto;
import com.xworkz.movie.service.UserService;
import com.xworkz.movie.service.imple.UserServImple;

public class Runner {
    public static void main(String[] args) {
//        UserDto dto =new UserDto();
//        dto.setName("bahubali");
//        dto.setLang("telugu");
//        dto.setStatus("industry-hit");
//        dto.setRating("4");
//
//        UserDto dto1 = new UserDto();
//        dto1.setName("RRR");
//        dto1.setLang("telugu");
//        dto1.setStatus("blockbuster");
//        dto1.setRating("4.8");
//
//        UserDto dto2 = new UserDto();
//        dto2.setName("KGF");
//        dto2.setLang("kannada");
//        dto2.setStatus("super-hit");
//        dto2.setRating("4.5");
//
//        UserDto dto3 = new UserDto();
//        dto3.setName("Vikram");
//        dto3.setLang("tamil");
//        dto3.setStatus("hit");
//        dto3.setRating("4.2");
//
//        UserDto dto4 = new UserDto();
//        dto4.setName("Pushpa");
//        dto4.setLang("telugu");
//        dto4.setStatus("pan-india-hit");
//        dto4.setRating("4.3");
//
//        UserDto dto5 = new UserDto();
//        dto5.setName("Leo");
//        dto5.setLang("tamil");
//        dto5.setStatus("average");
//        dto5.setRating("3.8");
//
//
//       UserService service = new UserServImple();
//       service.update("Leo","telugu");
//       service.delete(4);
//        service.validate(dto);
//        service.validate(dto1);
//        service.validate(dto2);
//        service.validate(dto3);
//        service.validate(dto4);
//        service.validate(dto5);

        UserService service = new UserServImple();
        System.out.println(service.fetch(6));



    }
}