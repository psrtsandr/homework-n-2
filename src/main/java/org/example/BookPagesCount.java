package org.example;

public record BookPagesCount(int value) implements Comparable<BookPagesCount> {
    public BookPagesCount {
        if (value < 0) {
            throw new IllegalArgumentException("Pages count should be non-negative");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int compareTo(BookPagesCount o) {
        return Integer.compare(value, o.value);
    }
}
