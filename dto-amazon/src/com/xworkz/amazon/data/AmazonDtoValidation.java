package com.xworkz.amazon.data;
import com.xworkz.amazon.fixed.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AmazonDtoValidation {
    private String fristName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private String email;
    private String password;
}
