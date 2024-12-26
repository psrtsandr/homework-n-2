package org.example;

import java.util.List;

public class Student {
    private final FirstName firstName;
    private final LastName lastName;
    private final List<Book> books;

    public Student(FirstName firstName, LastName lastName, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public LastName getLastName() {
        return lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student (First Name: %1$s; Last Name: %2$s)".formatted(firstName, lastName);
    }
}
