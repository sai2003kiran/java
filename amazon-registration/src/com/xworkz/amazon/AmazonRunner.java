package com.xworkz.amazon;

import com.xworkz.amazon.constants.Gender;
import com.xworkz.amazon.encaplatedDto.AmazonDto;
import com.xworkz.amazon.validation.Amazon;

public class AmazonRunner {
    public static void main(String[] args) {
      AmazonDto amazonDto = new AmazonDto();
      amazonDto.setUserName("saikiranM");
      amazonDto.setEmail("baba@gmail.com");
      amazonDto.setPassword("jhcpijcd986");
      amazonDto.setPhoneNumber("9834456789");
      amazonDto.setGender(Gender.Males);

        Amazon details = new Amazon();
        details.userRegister(amazonDto);

    }
}
