package ru.otus.qa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.qa.jpa.User;
import ru.otus.qa.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createUser( User user ) {
        return userRepository.save( user );
    }

    @Override
    public User find( Long id ) {
        return userRepository.getById( id );
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
