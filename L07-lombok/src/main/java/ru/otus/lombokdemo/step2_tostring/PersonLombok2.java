package ru.otus.lombokdemo.step2_tostring;

import lombok.*;

@Getter
@Setter
@ToString(of = {"id", "name"})
public class PersonLombok2 {
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
