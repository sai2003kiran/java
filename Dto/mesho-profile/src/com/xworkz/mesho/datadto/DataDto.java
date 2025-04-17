package com.xworkz.mesho.datadto;

import com.xworkz.mesho.constants.City;
import com.xworkz.mesho.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataDto {
    private String fullName;
    private String dob;
    private String phno;
    private Gender gender;
    private City city;
}
