package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.UserDto;

public interface UserSerive {
    boolean validate(UserDto dto);
    boolean update(int id, String bType);
    boolean delete(int id);
}
