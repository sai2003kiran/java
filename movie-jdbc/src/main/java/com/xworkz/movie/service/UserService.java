package com.xworkz.movie.service;

import com.xworkz.movie.dto.UserDto;

public interface UserService {
    boolean validate(UserDto dto);
    boolean update(String name,String lang);
    boolean delete(int id);
    UserDto fetch(int id);
}
