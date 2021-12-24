package ru.otus.lombokdemo.step4_constructor;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor(staticName = "create")
public class PersonLombok4 {
    private final int id;
    private final String name;
    private String address;
    private String email;
}

