package com.example.krontm.repositories;

import com.example.krontm.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
    Users findByLoginAndPassword(String login, String password);
}
