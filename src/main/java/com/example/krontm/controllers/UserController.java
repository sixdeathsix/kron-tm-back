package com.example.krontm.controllers;

import com.example.krontm.entities.Users;
import com.example.krontm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity auth(@RequestParam String login, @RequestParam String password) {
        try {
            return ResponseEntity.ok(userService.auth(login, password));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
