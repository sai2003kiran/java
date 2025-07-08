package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.UserDto;

public interface UserRepositoy {
    boolean save(UserDto dto);
    boolean update(int id, String bType);
    boolean delete(int id);
}
