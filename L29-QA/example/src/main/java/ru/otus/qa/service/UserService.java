package ru.otus.qa.service;

import ru.otus.qa.jpa.User;

import java.util.List;

public interface UserService {
    User createUser( User user );

    User find( Long id );

    List<User> findAll();
}
