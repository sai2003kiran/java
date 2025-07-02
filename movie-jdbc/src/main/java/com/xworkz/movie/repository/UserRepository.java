package com.xworkz.movie.repository;

import com.xworkz.movie.dto.UserDto;

public interface UserRepository {
    boolean save(UserDto dto);
    boolean update(String name,String lang);
    boolean delete(int id);
    UserDto fetch(int id);
}
