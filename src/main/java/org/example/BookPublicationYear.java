package org.example;

public record BookPublicationYear(int value) {
    public BookPublicationYear {
        if (value < 0) {
            throw new IllegalArgumentException("Year must be non-negative");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
