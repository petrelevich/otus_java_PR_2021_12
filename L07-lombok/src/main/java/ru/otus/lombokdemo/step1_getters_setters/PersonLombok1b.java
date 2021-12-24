package ru.otus.lombokdemo.step1_getters_setters;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

// Аннотации @Getter и @Setter для класса
@Getter
@Setter
public class PersonLombok1b {
    @Getter(AccessLevel.NONE)
    private int id;

    @Setter(AccessLevel.NONE)
    private String name;

    private String address;

    @Setter(AccessLevel.PROTECTED)
    private String email;
}
