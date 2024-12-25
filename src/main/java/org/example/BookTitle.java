package org.example;

public record BookTitle(String value) {
    public BookTitle {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Book title should be specified");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
