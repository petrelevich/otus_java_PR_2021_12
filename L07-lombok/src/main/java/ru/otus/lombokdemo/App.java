package ru.otus.lombokdemo;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // От Person мы хотим получить:
        // конструкторы
        var person1 = new Person(1, "Ivanov", "Moscow", "ivanov@abcdef.com");
        var person2 = new Person(2, "Petrov");

        // статический фабричный метод
        var person3 = Person.create(3, "Sidorov");

        // toString
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // геттеры, сеттеры
        person1.setEmail("ivanov_ivan@abcdef.com");
        System.out.println(person1.getEmail());

        // Builder для удобного создания объекта
        var person4 = Person.builder()
                .id(4)
                .name("Petrov")
                .build();
        System.out.println(person4);

        // hashCode, equals
        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
    }
}
