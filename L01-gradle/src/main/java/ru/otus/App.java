package ru.otus;

import com.zaxxer.hikari.HikariConfig;

public class App {
    public static void main(String... args) {
        HikariConfig config = new HikariConfig();
        System.out.println(config);
    }
}
