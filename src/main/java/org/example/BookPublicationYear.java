package org.example;

public record BookPublicationYear(int value) implements Comparable<BookPublicationYear> {
    public BookPublicationYear {
        if (value < 0) {
            throw new IllegalArgumentException("Year must be non-negative");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int compareTo(BookPublicationYear o) {
        return Integer.compare(value, o.value);
    }
}
