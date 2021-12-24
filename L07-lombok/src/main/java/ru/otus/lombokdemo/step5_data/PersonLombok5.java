package ru.otus.lombokdemo.step5_data;

import lombok.*;
@ToString(of = {"id", "name"})


@Data
@AllArgsConstructor
public class PersonLombok5 {
    @Getter(AccessLevel.NONE)
    private int id;

    @Setter(AccessLevel.NONE)
    private String name;

    private String address;

    @Setter(AccessLevel.PROTECTED)
    private String email;
}
