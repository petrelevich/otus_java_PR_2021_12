package ru.otus.intqa.cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.web.client.RestTemplate;
import ru.otus.qa.jpa.User;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSteps {
    private List<User> userList;

    RestTemplate restTemplate = new RestTemplate();


    @Given("application is turned on")
    public void application_is_turned_on() {
        String result = restTemplate.getForObject( "http://localhost:11011/check", String.class );
        assertEquals( "OK", result );
    }

    @Given("the following users:")
    public void the_following_users( DataTable dataTable ) {
        this.userList = dataTable.asLists().stream()
                .map( l -> new User(null, l.get( 0 ), l.get( 1 )) )
                .collect( Collectors.toList());

    }

    @When("i create users")
    public void i_create_users() {
//        restTemplate.exchange(  )
        // Отправить на http endpoint

    }

    @Then("i see user in userlist")
    public void i_see_user_in_userlist() {

    }
}
