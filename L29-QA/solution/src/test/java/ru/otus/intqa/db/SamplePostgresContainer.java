package ru.otus.intqa.db;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.junit.jupiter.Testcontainers;
import ru.otus.qa.Starter;
import ru.otus.qa.jpa.User;
import ru.otus.qa.service.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Starter.class)
@ActiveProfiles("test-containers")
@Testcontainers
public class SamplePostgresContainer {
    @Autowired
    private UserService userService;

    @Test
    @Transactional
    public void createNewUser() {
        User user = new User( null, "Крис Гир", "boss@supercompany.com" );
        userService.createUser( user );

        var savedUser = userService.find( user.getId() );

        assertEquals( user.getEmail(), savedUser.getEmail() );
    }


}
