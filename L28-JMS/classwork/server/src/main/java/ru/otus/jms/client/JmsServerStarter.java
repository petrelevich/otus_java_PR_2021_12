package ru.otus.jms.client;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class JmsServerStarter {
    public static void main(String[] args) {
        SpringApplication.run(JmsServerStarter.class, args);
    }
}
