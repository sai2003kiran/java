package com.xworkz.facebookApp;

import com.xworkz.facebookApp.Constants.Gender;
import com.xworkz.facebookApp.facebook.FaceBook;
import com.xworkz.facebookApp.facebookdto.FaceBookDto;

public class FaceBookRunner {
    public  static  void main(String arg[]){

        FaceBookDto faceBookDto = new FaceBookDto();
        faceBookDto.setFullName("Shalini");
        faceBookDto.setDob("17/6/03");
        faceBookDto.setEmail("sgjlai@346");
        faceBookDto.setPassword("ghjuyr");
        faceBookDto.setGender(Gender.Female);

        FaceBook faceBook = new FaceBook();
        if(faceBook.registerUser(faceBookDto)){
            System.out.println("successful");
        }
        else
            System.out.println("unsuccessful");
    }
}
