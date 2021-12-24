package ru.otus.lombokdemo.step1_getters_setters;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

// Аннотации @Getter и @Setter для полей
public class PersonLombok1a {
    private int id;

    @Getter
    private String name;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter(AccessLevel.PROTECTED)
    private String email;
}
