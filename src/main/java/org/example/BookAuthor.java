package org.example;

public record BookAuthor(String value) {
    public BookAuthor {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Book author should be specified");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
