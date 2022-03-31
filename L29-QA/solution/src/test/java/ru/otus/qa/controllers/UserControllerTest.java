package ru.otus.qa.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import ru.otus.qa.jpa.User;
import ru.otus.qa.service.UserService;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;

    @Test
    public void testGetUser() throws Exception {
        User user = new User( 1L, "Крис Гир", "boss@supercompany.com" );

        given( userService.find( 1L ) ).willReturn( user );

        Gson gson = new GsonBuilder().create();
        mvc.perform( get( "/users/{id}", 1L ).accept( "application/json; charset=utf-8" ) )
                .andExpect( status().isOk() )
                .andExpect( content().string( gson.toJson( user ) ) );
    }

}