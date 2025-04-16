package com.xworkz.linkden.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class DataDto {
    private String fristName;
    private String middleName;
    private String lastName;
    private String dob;
    private String email;
    private String password;
}
