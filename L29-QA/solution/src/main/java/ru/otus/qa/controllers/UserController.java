package ru.otus.qa.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.otus.qa.jpa.User;
import ru.otus.qa.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{id}")
    public User findById( @PathVariable Long id ) {
        return userService.find( id );
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public User update( @RequestParam(value = "user") User user ) {
        return userService.createUser( user );
    }
}
