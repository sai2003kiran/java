package com.xworkz.jdbc.service.imple;

import com.xworkz.jdbc.dto.UserDto;
import com.xworkz.jdbc.repository.UserRepositoy;
import com.xworkz.jdbc.repository.imple.UserRepoImple;
import com.xworkz.jdbc.service.UserSerive;

public class UserServImple implements UserSerive {
   UserRepositoy repositoy = new UserRepoImple();
    @Override
    public boolean validate(UserDto dto) {
        boolean isValidate = false;
        boolean isName = false;
        boolean isType = false;
        boolean isAddress = false;

        if (dto.getAccountName() != null && !dto.getAccountName().isEmpty()) {
            isName = true;
        }

        if (dto.getAccountType() != null && !dto.getAccountType().isEmpty()) {
            isType = true;
        }

        if (dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            isAddress = true;
        }

        if (isAddress && isType && isName) {
            isValidate=repositoy.save(dto);
        }

        return isValidate;
    }

    @Override
    public boolean update(int id, String bType) {
        boolean updateTable = false;
        if (id > 0 && bType != null && !bType.isEmpty()) {
            updateTable=repositoy.update(id,bType);
        }
        return updateTable;
    }

    @Override
    public boolean delete(int id) {
       boolean deleteTable = false;
        if (id > 0) {
            deleteTable= repositoy.delete(id);
        }
        return deleteTable;
    }
}
