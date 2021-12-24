package ru.otus.lombokdemo.step3_equals_hashcode;

import lombok.*;

@Getter
@Setter
@ToString(of = {"id", "name"})
@EqualsAndHashCode
public class PersonLombok3 {
    @Getter(AccessLevel.NONE)
    private int id;

    @Setter(AccessLevel.NONE)
    private String name;

    private String address;

    @Setter(AccessLevel.PROTECTED)
    private String email;
}

class App {
    public static void main(String[] args) {
        var person1 = new PersonLombok3();
        var person2 = new PersonLombok3();

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1 == person2); // false
    }
}
