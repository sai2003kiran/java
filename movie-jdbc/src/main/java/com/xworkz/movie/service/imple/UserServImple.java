package com.xworkz.movie.service.imple;

import com.xworkz.movie.dto.UserDto;
import com.xworkz.movie.repository.UserRepository;
import com.xworkz.movie.repository.imple.UserRepoImple;
import com.xworkz.movie.service.UserService;

public class UserServImple implements UserService {
    UserRepository repository = new UserRepoImple();
    @Override
    public boolean validate(UserDto dto) {

        boolean validate=false;
        boolean isName=false;
        boolean isLang=false;
        boolean isStatus=false;
        boolean isReview=false;
        if (dto.getName() != null && !dto.getName().isEmpty()) {
            isName=true;
        }
        if (dto.getLang() != null && !dto.getLang().isEmpty()) {
            isLang=true;
        }
        if (dto.getStatus() != null && !dto.getStatus().isEmpty()) {
            isStatus=true;
        }
        if (dto.getRating() != null && !dto.getRating().isEmpty()) {
            isReview=true;
        }
        if (isReview && isLang && isStatus && isName) {
            validate=repository.save(dto);
        }
        return validate;
    }

    @Override
    public boolean update(String name, String lang) {
        boolean upd=false;
        if (name!=null && !name.isEmpty() && lang!=null && !lang.isEmpty()) {
          upd= repository.update(name, lang);
        }
        return upd;
    }

    @Override
    public boolean delete(int id) {
        boolean del=false;
        if (id >0) {
            repository.delete(id);
        }
        return del;
    }

    @Override
    public UserDto fetch(int id) {
        UserDto data = null;
        if (id > 0) {
            data = repository.fetch(id);
        }
        return data;
    }
}
