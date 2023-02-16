package com.example.krontm.services;

import com.example.krontm.entities.Users;
import com.example.krontm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users auth(String login, String password) throws Exception {

        Users user = userRepository.findByLoginAndPassword(login, password);

        if (user == null) {
            throw new Exception("Сотрудник не найден");
        }

        return Users.toModel(user);
    }

}
