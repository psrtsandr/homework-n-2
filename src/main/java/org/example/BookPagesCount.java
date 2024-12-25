package org.example;

public record BookPagesCount(int value) {
    public BookPagesCount {
        if (value < 0) {
            throw new IllegalArgumentException("Pages count should be non-negative");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
