package com.example.krontm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String patronymic;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "gender_id", nullable = false)
    private Genders genders;

    @OneToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles roles;

    public static Users toModel(Users user) {
        Users model = new Users();
        model.setUser_id(user.getUser_id());
        model.setSurname(user.getSurname());
        model.setName(user.getName());
        model.setPatronymic(user.getPatronymic());
        model.setEmail(user.getEmail());
        model.setPhone(user.getPhone());
        model.setLogin(user.getLogin());
        return model;
    }


}
