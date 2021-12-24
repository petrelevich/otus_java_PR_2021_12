package ru.otus.lombokdemo;

// "Маленький" класс на чистой Java
public class Person {
    private final int id;
    private final String name;
    private String address;
    private String email;

    public Person(int id, String name) {
        this(id, name, null, null);
    }

    public Person(int id, String name, String address, String email) {
        if (name == null)
            throw new IllegalArgumentException("name cannot be null");

        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public static Person create(int id, String name) {
        return new Person(id, name);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public static class PersonBuilder {
        private int id;
        private String name;
        private String address;
        private String email;

        PersonBuilder() {
        }

        public PersonBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            if (name == null)
                throw new IllegalArgumentException("name cannot be null");

            this.name = name;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(id, name, address, email);
        }
    }
}
