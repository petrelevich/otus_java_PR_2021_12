package ru.otus.jms.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsClientStarter {
    public static void main(String[] args) {
        SpringApplication.run(JmsClientStarter.class, args);
    }
}
