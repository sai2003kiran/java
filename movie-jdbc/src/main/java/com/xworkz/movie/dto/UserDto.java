package com.xworkz.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private String lang;
    private String rating;
    private String status;
}
