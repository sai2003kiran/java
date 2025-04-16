package com.xworkz.passportseva.passport;

import com.xworkz.passportseva.constants.Area;
import com.xworkz.passportseva.constants.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassportDto {

    private Location location;
    private Area area;
    private   String firstName;
    private  String lastName;
    private String birthDate;
    private String email;
    private boolean EmailSame;
    private String userId;
    private String password;
    private String confirmPassword;
    private String securityQuestion;
    private String securityAnswer;
    private String captcha ;


}
