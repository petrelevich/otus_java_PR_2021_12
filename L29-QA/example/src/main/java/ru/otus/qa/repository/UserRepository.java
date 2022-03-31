package ru.otus.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.qa.jpa.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
